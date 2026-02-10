package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
