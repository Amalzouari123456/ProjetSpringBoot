package tn.esprit.gestionprojets.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionprojets.dto.EntrepriseDTO;
import tn.esprit.gestionprojets.services.EntrepriseService;

import java.util.List;

@RestController
@RequestMapping("/entreprises")
@RequiredArgsConstructor
public class EntrepriseController {

    private final EntrepriseService service;

    @PostMapping
    public EntrepriseDTO ajouter(@RequestBody EntrepriseDTO dto) {
        return service.ajouter(dto);
    }

    @GetMapping
    public List<EntrepriseDTO> getAll() {
        return service.getAll();
    }
}