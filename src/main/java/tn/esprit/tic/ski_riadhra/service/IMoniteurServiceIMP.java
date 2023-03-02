package tn.esprit.tic.ski_riadhra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ski_riadhra.Entities.Moniteur;
import tn.esprit.tic.ski_riadhra.repositories.Moniteur_repository;

import java.util.List;
import java.util.Optional;
@Service
public class IMoniteurServiceIMP implements IMoniteurService {

@Autowired
    Moniteur_repository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Optional<Moniteur> retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);

    }
}
