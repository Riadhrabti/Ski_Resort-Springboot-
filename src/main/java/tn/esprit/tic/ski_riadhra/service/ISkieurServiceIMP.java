package tn.esprit.tic.ski_riadhra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ski_riadhra.Entities.Skieur;
import tn.esprit.tic.ski_riadhra.repositories.Skieur_repository;

import java.util.List;

@Service
public class ISkieurServiceIMP implements ISkieurService {

@Autowired
    Skieur_repository skieur_repository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieur_repository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieur_repository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return null;
    }
}
