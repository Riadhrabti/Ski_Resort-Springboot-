package tn.esprit.tic.ski_riadhra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ski_riadhra.Entities.Inscription;
import tn.esprit.tic.ski_riadhra.service.IInscriptionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("inscription")
public class InsciptionContoller {
    @Autowired
    IInscriptionService InscriptionService ;
    @GetMapping
    public List<Inscription> getAll(){
        return InscriptionService.retrieveAllInscription();

    }
    @GetMapping("{numInscription}")

    public Optional<Inscription> retrieveInscription(@PathVariable Long numInscription) {

        return  InscriptionService.retrieveInscription(numInscription);

    }
    @PostMapping

    public Inscription addInscription(@RequestBody Inscription inscription){

        return InscriptionService.addInscription(inscription);
    }
    @DeleteMapping("{numInscription}")
    public void removeInscription(@PathVariable Long numInscription){

        InscriptionService.removeInscription(numInscription);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription) {

        return  InscriptionService.updateInscription(inscription);

    }



}
