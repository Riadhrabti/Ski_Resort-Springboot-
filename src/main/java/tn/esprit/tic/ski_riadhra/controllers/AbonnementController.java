package tn.esprit.tic.ski_riadhra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ski_riadhra.Entities.Abonnement;
import tn.esprit.tic.ski_riadhra.service.IAbonnementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("abonnement")

public class AbonnementController {
    @Autowired
    IAbonnementService AbonnementService;
    @GetMapping
    public List<Abonnement> getAll(){
        return AbonnementService.retrieveAllAbonnement();

    }
    @GetMapping("{numAbon}")

    public Optional<Abonnement> retrieveAbonnement(@PathVariable Long numAbon) {

        return  AbonnementService.retrieveAbonnement(numAbon);

    }
    @PostMapping

    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){

        return AbonnementService.addAbonnement(abonnement);
    }
    @DeleteMapping("{numAbon}")
    public void removeAbonnement(@PathVariable Long numAbon){

        AbonnementService.removeAbonnement(numAbon);
    }

    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement) {

        return  AbonnementService.updateAbonnement(abonnement);

    }
}
