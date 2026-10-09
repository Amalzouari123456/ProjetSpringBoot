package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Repositories.ClientRepository;
import tn.esprit.autoloc.Repositories.ContratRepository;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public class ContratService implements IContratService {
private ContratRepository ContratRepo;
    @Override
    public Contrat addContrat(Contrat contrat) {
        return ContratRepo.save(contrat);
    }

    @Override
    public void deleteClient(Long id) {
        ContratRepo.deleteById(id);
    }

    @Override
    public List<Contrat> recupererContrat() {
        return ContratRepo.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return ContratRepo.save(contrat);
    }
}
