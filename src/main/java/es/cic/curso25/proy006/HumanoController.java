package es.cic.curso25.proy006;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/humanos")
public class HumanoController {
//Es necesario para que Springboot cree mi objeto HumanoService.   
@Autowired
    private HumanoService humanoService;
    //private HumanoService humanoService = new HumanoService();

    public HumanoController(HumanoService humanoService) {
        this.humanoService = humanoService;
    }

    @GetMapping
    public List<Humano> listadoHumanos() {
        return humanoService.listadoHumanos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Humano> obtenerporId(@PathVariable Long id) {

        Optional<Humano> humanoOpt = humanoService.obtenerPorId(id);

        if (humanoOpt.isPresent()) {
            return ResponseEntity.ok(humanoOpt.get());

        } else {
            return ResponseEntity.notFound().build();
        }

    }

    //http://localhost:8080/humanos/1/revisar?organo=corazon
    @GetMapping("/{id}/revisar")
    public ResponseEntity<Organo> revisarOrgano(@PathVariable Long id, @RequestParam String organo) {

        Optional<Humano> humanoOpt=humanoService.obtenerPorId(id);

        if (!humanoOpt.isPresent()) {
            return ResponseEntity.notFound().build();
            
        }
        Organo organoRevisado = humanoService.revisaOrgano(organo);
        return ResponseEntity.ok(organoRevisado);
    }
}
