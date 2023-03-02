package tn.esprit.tic.ski_riadhra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ski_riadhra.Entities.Piste;
import tn.esprit.tic.ski_riadhra.Entities.Skieur;
import tn.esprit.tic.ski_riadhra.repositories.Piste_repository;
import tn.esprit.tic.ski_riadhra.repositories.Skieur_repository;

import java.util.List;

@Service
public class ISkieurServiceIMP implements ISkieurService {

@Autowired
    Skieur_repository skieur_repository;
    @Autowired
    Piste_repository pisteRepository;
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
        skieur_repository.deleteById(numSkieur);

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
       return  skieur_repository.findById(numSkieur).orElse(null);

    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {

        return skieur_repository.save(skieur) ;
    }
    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //Recuperation des objets
        Skieur skieur = skieur_repository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        //verification non null
        if(skieur != null && piste != null){
            //Traitement
            piste.getSkieurs().add(skieur);
            /*List<Piste> pistes = skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);*/

            //save
            pisteRepository.save(piste);
        }
        return skieur_repository.findById(numSkieur).orElse(null);
    }




}


