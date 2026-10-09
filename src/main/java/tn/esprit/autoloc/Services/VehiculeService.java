package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Repositories.VehiculeRepository;
import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public class VehiculeService implements IVehiculeService {
    private VehiculeRepository VehiculeRepo ;

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return VehiculeRepo.save(v);
    }

    @Override
    public void deleteVehicule(Long id) {
        VehiculeRepo.deleteById(id);

    }

    @Override
    public List<Vehicule> recupererVehicule() {
        return VehiculeRepo.findAll();
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return VehiculeRepo.save(v);
    }
}
