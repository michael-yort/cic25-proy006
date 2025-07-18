package es.cic.curso25.proy006.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.curso25.proy006.model.Motor;
import es.cic.curso25.proy006.repository.MotorRepository;
//import es.cic.curso25.proy006.repository.MotorRepositoryImpl;

@Service
public class MotorService {

    // private final static Logger LOGGER =
    // LoggerFactory.getLogger(MotorService.class.getName());

    @Autowired
    private MotorRepository motorRespository;

    public long create(Motor motor) {

        // Los dias festivos y los fines de semana esta empresa no hace motores.
        // return motorRespository.create(motor);

        motorRespository.save(motor);
        return motor.getId();
    }

    public Motor get(long id) {
        motorRespository.findById(id);
        Optional<Motor> resultado = motorRespository.findById(id);

        return resultado.orElse(null);
    }

    public List<Motor> get() {
        return motorRespository.findAll();
    }

    public void update(Motor motor) {
        motorRespository.save(motor);
    }

    public void delete(long id) {
        motorRespository.deleteById(id);
    }
}
