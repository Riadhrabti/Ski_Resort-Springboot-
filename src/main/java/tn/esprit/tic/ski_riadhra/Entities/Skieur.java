package tn.esprit.tic.ski_riadhra.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long numSkieur ;
    private String nomS ;
    private String prenomS;
    private LocalDate dateNaissance ;
    private String ville ;
    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
    @OneToOne( cascade = CascadeType.REMOVE)
    private Abonnement abonnement;

}
