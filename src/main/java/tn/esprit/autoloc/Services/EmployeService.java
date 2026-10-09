package tn.esprit.autoloc.Services;


import tn.esprit.autoloc.Repositories.EmployeRepository;

import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public class EmployeService implements IEmployeService {

    private EmployeRepository EmployeRepo;
    @Override
    public Employe addEmploye(Employe employe) {
        return EmployeRepo.save(employe);
    }



    @Override
    public void deleteClient(Long id) {
        EmployeRepo.deleteById(id);

    }

    @Override
    public List<Employe> recupererEmploye() {
        return EmployeRepo.findAll();
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return EmployeRepo.save(employe);
    }
}


