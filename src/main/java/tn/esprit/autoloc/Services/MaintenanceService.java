package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Repositories.MaintenanceRepository;
import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public class MaintenanceService implements IMaintenanceService{

    private MaintenanceRepository MaintanceRepo ;
    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return MaintanceRepo.save(m);
    }

    @Override
    public void deleteMaintenance(Long id) {
        MaintanceRepo.deleteById(id);

    }

    @Override
    public List<Maintenance> recupererMaintenance() {
        return MaintanceRepo.findAll();
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return MaintanceRepo.save(m);
    }
}
