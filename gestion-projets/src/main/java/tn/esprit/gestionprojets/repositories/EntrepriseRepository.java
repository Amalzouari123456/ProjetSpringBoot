package tn.esprit.gestionprojets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionprojets.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
}