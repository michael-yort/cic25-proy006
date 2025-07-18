package es.cic.curso25.proy006.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.cic.curso25.proy006.model.Motor;
import es.cic.curso25.proy006.service.MotorService;

@RestController
@RequestMapping("/motor")
public class MotorController {

    // CON ESTA LINEA PUEDO TENER UN LOGGER ESPECIFICO PARA ESTA CLASE
    private final static Logger LOGGER = LoggerFactory.getLogger(MotorController.class.getName());

    @Autowired
    private MotorService motorService;

    @PostMapping
    public long create(Motor motor) {

        try {
            if (motor.getId() != null) {
                throw new RuntimeException("Al crear no me puedes pasar la id");
            }
            this.motorService=null; //Provoco un error
        } catch (RuntimeException re) {

            // LOGGER.error(re.getMessage());
            // re.printStackTrace();
            throw new MotorException("Ha fallado el motor al crear ", re);
        }

        return motorService.create(motor);
    }

}
