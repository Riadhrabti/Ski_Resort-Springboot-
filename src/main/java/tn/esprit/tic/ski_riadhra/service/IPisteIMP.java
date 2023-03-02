package tn.esprit.tic.ski_riadhra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ski_riadhra.Entities.Piste;
import tn.esprit.tic.ski_riadhra.repositories.Piste_repository;

import java.util.List;
import java.util.Optional;
@Service
public class IPisteIMP implements IPisteService {

    @Autowired
    Piste_repository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll() ;
    }

    @Override

    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Optional<Piste> retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste);
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);

    }
}
