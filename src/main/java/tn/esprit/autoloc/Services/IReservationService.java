package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation (Reservation r) ;

    void deleteReservation (Long id);
    List<Reservation> recupererReservation ();

    Reservation updateReservation (Reservation r);
}
