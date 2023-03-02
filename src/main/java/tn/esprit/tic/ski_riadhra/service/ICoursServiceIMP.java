package tn.esprit.tic.ski_riadhra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ski_riadhra.Entities.Cours;
import tn.esprit.tic.ski_riadhra.repositories.Cours_repository;

import java.util.List;
import java.util.Optional;
@Service
public class ICoursServiceIMP implements ICoursService {
    @Autowired
    Cours_repository coursRepository;
    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll() ;
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Optional<Cours> retrieveCours(Long numCours) {
        return coursRepository.findById(numCours);
    }

    @Override
    public void removeCours(Long numCours) {
    coursRepository.deleteById(numCours);
    }
}
