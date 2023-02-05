package tn.esprit.tic.ski_riadhra.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours ;
    private int niveau ;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.ORDINAL)

    private Support support;
    private float prix;
    private int creneau ;
    @Transient   //ma todhhorch fel base de données
    private int nomProf;
    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptions;



}
