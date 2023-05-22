package ma.enset.immatriculationservice.repository;

import ma.enset.immatriculationservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {

    Vehicule findByNumeroMatricule(String mtr);
}
