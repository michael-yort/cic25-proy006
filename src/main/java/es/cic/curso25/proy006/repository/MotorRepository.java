package es.cic.curso25.proy006.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import es.cic.curso25.proy006.model.Motor;

public interface MotorRepository extends JpaRepository<Motor,Long>{

}
