package tn.esprit.tic.ski_riadhra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ski_riadhra.Entities.Abonnement;
import tn.esprit.tic.ski_riadhra.repositories.Abonnement_repository;

import java.util.List;
import java.util.Optional;

@Service
public class IAbonnementServiceIMP implements IAbonnementService{

    @Autowired
    Abonnement_repository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Optional<Abonnement> retrieveAbonnement(Long numAbon) {
        return abonnementRepository.findById(numAbon);
    }

    @Override
    public void removeAbonnement(Long numAbon) {
        abonnementRepository.deleteById(numAbon);
    }
}
