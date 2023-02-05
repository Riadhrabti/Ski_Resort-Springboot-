package tn.esprit.tic.ski_riadhra.Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long numSkieur ;
    private String nomS ;
    private String prenomS;
    private LocalDate dateNaissance ;
    private String ville ;
    @ManyToMany
    private List<Piste> pistes;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
    @OneToOne(mappedBy = "skieur", cascade = CascadeType.REMOVE)
    private Abonnement abonnement;

}
