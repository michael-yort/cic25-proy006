//CON JPA YA NO NECESITO TENER ESTE REPOSITORIO
// package es.cic.curso25.proy006.repository;

// import java.util.HashMap;
// import java.util.Iterator;
// import java.util.Map;
// import java.util.Set;

// import org.springframework.stereotype.Repository;

// import es.cic.curso25.proy006.model.Motor;
// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Repository
// public class MotorRepositoryImpl {

//     @PersistenceContext

//     private EntityManager em;
    
//     private Map<Long, Motor> motores = new HashMap<>();

//     public long create(Motor motor) {

//         em.persist(motor);
//         return motor.getId();

//         // long mayor = getSiguienteId();
//         // long mayor = getSiguienteIdConStreams();

//         // motor.setId(mayor);
//         // motores.put(motor.getId(), motor);
//         // return motor.getId();

//     }

//     // Forma "SIMPLE" con lambda "funcion flecha."
//     private long getSiguienteIdConStreams() {
//         long mayor = motores
//                 .keySet()
//                 .stream()
//                 .max(Long::compare)
//                 .orElse(0L) + 1;
//         return mayor;
//     }

//     // private long getSiguienteId() {
//     // long mayor = 0;
//     // Set<Long> ids = motores.keySet();

//     // Iterator<Long> iteratorId = ids.iterator();

//     // while (iteratorId.hasNext()) {
//     // Long siguiente = iteratorId.next();

//     // if (siguiente.longValue() > mayor) {
//     // mayor = siguiente;
//     // }
//     // }
//     // return mayor;
//     // }
// }
