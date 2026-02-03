package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;
    @ManyToOne
    @JoinColumn(name = "foyer_id")
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private Set<Chambre> chambres;

}
