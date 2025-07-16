package es.cic.curso25.proy006.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.curso25.proy006.model.Motor;
import es.cic.curso25.proy006.repository.MotorRepository;


@Service
public class MotorService {

    @Autowired
    private MotorRepository motorRespository;

    public long create (Motor motor){

        //Los dias festivos y los fines de semana esta empresa no hace motores.

        return motorRespository.create(motor);
    }
}
