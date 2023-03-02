package tn.esprit.tic.ski_riadhra.service;

import tn.esprit.tic.ski_riadhra.Entities.Moniteur;

import java.util.List;
import java.util.Optional;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Optional<Moniteur> retrieveMoniteur (Long numMoniteur);
    void removeMoniteur  (Long numMoniteur);

}
