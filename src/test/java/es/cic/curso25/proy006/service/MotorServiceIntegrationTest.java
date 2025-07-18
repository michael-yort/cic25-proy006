package es.cic.curso25.proy006.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic.curso25.proy006.model.Motor;

@SpringBootTest
public class MotorServiceIntegrationTest {

    @Autowired
    private MotorService motorService;

    @Test
    public void testCreate(){

        Motor motorACrear = new Motor();

        motorACrear.setEncendido(true);
        motorACrear.setMarca("Ivec");
        motorACrear.setPotencia(2.1);

        long idAsignado = motorService.create(motorACrear);

        assertTrue(idAsignado > 0, "El id debe ser un numero positivo");
    }
}
