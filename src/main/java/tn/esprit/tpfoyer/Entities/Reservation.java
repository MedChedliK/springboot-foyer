package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
@Entity
public class Reservation {
    @Id
    private String idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;

    @ManyToMany(mappedBy = "reservations", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

}
