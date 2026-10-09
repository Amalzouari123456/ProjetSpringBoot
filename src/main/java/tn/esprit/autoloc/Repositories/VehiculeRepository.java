package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository <Vehicule, Long> {
}
