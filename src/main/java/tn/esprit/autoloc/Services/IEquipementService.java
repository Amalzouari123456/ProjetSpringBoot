package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement addEquipement (Equipement e) ;

    void deleteEquipement (Long id);
    List<Equipement> recupererEquipement ();

    Equipement updateEquipement (Equipement e);

}
