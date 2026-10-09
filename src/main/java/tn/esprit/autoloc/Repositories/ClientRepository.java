package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Client;

public interface ClientRepository extends JpaRepository <Client, Long> {



}
