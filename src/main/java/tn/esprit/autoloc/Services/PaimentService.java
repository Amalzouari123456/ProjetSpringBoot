package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Repositories.PaimentRepository;
import tn.esprit.autoloc.entities.Paiment;

import java.util.List;

public class PaimentService implements IPaimentService {
    private PaimentRepository PaimentRepo ;

    @Override
    public Paiment addPaiment(Paiment p) {
        return PaimentRepo.save(p);
    }

    @Override
    public void deletePaiment(Long id) {
        PaimentRepo.deleteById(id);

    }

    @Override
    public List<Paiment> recupererPaiment() {
        return PaimentRepo.findAll();
    }

    @Override
    public Paiment updatePaiment(Paiment p) {
        return PaimentRepo.save(p);
    }
}
