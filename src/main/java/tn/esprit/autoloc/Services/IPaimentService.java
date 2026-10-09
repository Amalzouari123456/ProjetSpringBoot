package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Paiment;

import java.util.List;

public interface IPaimentService {
    Paiment addPaiment (Paiment p) ;

    void deletePaiment (Long id);
    List<Paiment> recupererPaiment ();

    Paiment updatePaiment (Paiment p);
}
