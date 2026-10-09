package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule (Vehicule v) ;

    void deleteVehicule (Long id);
    List<Vehicule> recupererVehicule ();

    Vehicule updateVehicule (Vehicule v);
}
