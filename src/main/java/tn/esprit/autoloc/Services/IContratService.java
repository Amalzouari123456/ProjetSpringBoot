package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat (Contrat contrat) ;

    void deleteClient (Long id);
    List<Contrat> recupererContrat ();

    Contrat updateContrat (Contrat contrat);
}
