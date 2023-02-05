package tn.esprit.tic.ski_riadhra.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;
    private LocalDate dateDebut ;
    private LocalDate dateFin;
    private float prixAbon ;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;
    @OneToOne
    private Skieur skieur;
}
