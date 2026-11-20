package tn.esprit.gestionprojets.mappers;

import org.springframework.stereotype.Component;
import tn.esprit.gestionprojets.dto.EntrepriseDTO;
import tn.esprit.gestionprojets.entities.Entreprise;

@Component
public class EntrepriseMapper {

    public EntrepriseDTO toDTO(Entreprise e) {
        EntrepriseDTO dto = new EntrepriseDTO();
        dto.setId(e.getId());
        dto.setNomEntreprise(e.getNom());     // nom → nomEntreprise
        dto.setAdresse(e.getAdresse());
        return dto;
    }

    public Entreprise toEntity(EntrepriseDTO dto) {
        Entreprise e = new Entreprise();
        e.setId(dto.getId());
        e.setNom(dto.getNomEntreprise());     // nomEntreprise → nom
        e.setAdresse(dto.getAdresse());
        return e;
    }
}