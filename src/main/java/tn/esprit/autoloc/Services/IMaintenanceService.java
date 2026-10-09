package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance addMaintenance (Maintenance m) ;

    void deleteMaintenance (Long id);
    List<Maintenance> recupererMaintenance ();

    Maintenance updateMaintenance (Maintenance e);
}
