package es.cic.curso25.proy006.service;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import es.cic.curso25.proy006.model.Humano;
import es.cic.curso25.proy006.model.Organo;

@Service
public class HumanoService {

    private final List<Humano> humanos = Arrays.asList(
            new Humano(1, "Andres", 23),
            new Humano(2, "Angela", 23),
            new Humano(3, "Pedro", 23));

    private final Random random = new Random();

    private final List<String> estados = Arrays.asList(
            "Se encuentra en buen estado",
            "Hace falta cuidados",
            "Se encuentra en pesimo estado");

    public List<Humano> listadoHumanos() {
        return humanos;
    }

    public Optional<Humano> obtenerPorId(Long id) {
        return humanos.stream()
                .filter(h -> h.getId() == id).findFirst();
    }

    public Organo revisaOrgano(String nombreOrgano) {

        String funcion;

        switch (nombreOrgano.toLowerCase()) {

            case "corazon":
                funcion = "Bombear sangre";
                break;

            case "pulmon":
                funcion = "Intercambio de gases";
                break;

            case "riñon":
                funcion = "Filtra desechos";
                break;

            case "higado":
                funcion = "Metaboliza sustancias";
                break;

            default:
                funcion = "Elige entre corazon,pulmon,riñon e higado";
                break;
        }

        String estadoAleatorio = estados.get(random.nextInt(estados.size()));
        return new Organo(nombreOrgano, funcion, estadoAleatorio);
    }

}
