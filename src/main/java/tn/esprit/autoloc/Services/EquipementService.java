package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Repositories.EquipementRepository;
import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public class EquipementService implements IEquipementService{

private EquipementRepository EquipementRepo ;
    @Override
    public Equipement addEquipement(Equipement e) {
        return EquipementRepo.save(e);
    }

    @Override
    public void deleteEquipement(Long id) {
        EquipementRepo.deleteById(id);
    }

    @Override
    public List<Equipement> recupererEquipement() {
        return EquipementRepo.findAll();
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return EquipementRepo.save(e);
    }
}
