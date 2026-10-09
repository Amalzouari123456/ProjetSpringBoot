package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Equipement;

public interface EquipementRepository extends JpaRepository <Equipement , Long> {
}
