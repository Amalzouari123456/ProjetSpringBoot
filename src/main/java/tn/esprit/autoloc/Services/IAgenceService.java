package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence addAgence (Agence agence) ;

    void deleteAgence (Long id);
    List <Agence> recupererAgence ();

    Agence updateAgence (Agence agence);



}
