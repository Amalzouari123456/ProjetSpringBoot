package tn.esprit.gestionprojets.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionprojets.dto.EntrepriseDTO;
import tn.esprit.gestionprojets.entities.Entreprise;
import tn.esprit.gestionprojets.mappers.EntrepriseMapper;
import tn.esprit.gestionprojets.repositories.EntrepriseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EntrepriseService {

    private final EntrepriseRepository repo;
    private final EntrepriseMapper mapper;

    public EntrepriseDTO ajouter(EntrepriseDTO dto) {
        Entreprise e = mapper.toEntity(dto);
        return mapper.toDTO(repo.save(e));
    }

    public List<EntrepriseDTO> getAll() {
        return repo.findAll().stream().map(mapper::toDTO).toList();
    }
}