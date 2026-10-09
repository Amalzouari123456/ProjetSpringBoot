package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe addEmploye (Employe employe) ;

    void deleteClient (Long id);
    List<Employe> recupererEmploye ();

    Employe updateEmploye (Employe employe);
}
