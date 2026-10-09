package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Paiment;

public interface PaimentRepository extends JpaRepository <Paiment, Long> {

}
