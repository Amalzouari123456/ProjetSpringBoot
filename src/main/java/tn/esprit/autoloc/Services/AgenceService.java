package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;
@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService{

    private AgenceRepository agenceRepo;
    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> recupererAgence() {
        return agenceRepo.findAll();
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepo.save(agence);
    }
}
