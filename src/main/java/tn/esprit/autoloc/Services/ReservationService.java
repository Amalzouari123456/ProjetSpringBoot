package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Repositories.ReservationRepository;
import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public class ReservationService implements IReservationService{
    private ReservationRepository ReservationRepo ;

    @Override
    public Reservation addReservation(Reservation r) {
        return ReservationRepo.save(r);
    }

    @Override
    public void deleteReservation(Long id) {
        ReservationRepo.deleteById(id);

    }

    @Override
    public List<Reservation> recupererReservation() {
        return ReservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return ReservationRepo.save(r);
    }
}
