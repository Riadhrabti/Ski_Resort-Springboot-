package tn.esprit.tic.ski_riadhra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ski_riadhra.Entities.Inscription;
import tn.esprit.tic.ski_riadhra.repositories.Inscription_repository;

import java.util.List;
import java.util.Optional;

@Service
public class IInscriptionServiceIMP implements IInscriptionService {

@Autowired
    Inscription_repository InscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return InscriptionRepository.findAll() ;
    }


    @Override
    public Inscription addInscription(Inscription inscription) {
        return InscriptionRepository.save(inscription) ;
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return InscriptionRepository.save(inscription);
    }

    @Override
    public Optional<Inscription> retrieveInscription(Long numInscription) {
        return InscriptionRepository.findById(numInscription);
    }

    @Override
    public void removeInscription(Long numInscription) {

 InscriptionRepository.deleteById(numInscription);
    }
}
