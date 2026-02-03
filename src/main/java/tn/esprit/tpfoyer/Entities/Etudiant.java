package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;


    private Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)

    private Set<Reservation> reservations;
}