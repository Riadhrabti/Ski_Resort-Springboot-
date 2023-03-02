package tn.esprit.tic.ski_riadhra.service;

import tn.esprit.tic.ski_riadhra.Entities.Inscription;

import java.util.List;
import java.util.Optional;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Optional<Inscription> retrieveInscription(Long numInscription);

    void removeInscription(Long numInscription);
}
