package tn.esprit.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.Entities.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
