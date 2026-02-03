package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity

public class Chambre {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idChambre;

        private Long numeroChambre;

        @Enumerated(EnumType.STRING)
        private TypeChambre typeC;

        @ManyToOne
        @JoinColumn(name = "bloc_id")

        private Bloc bloc;

        @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
        private Set<Reservation> reservations;
    }


