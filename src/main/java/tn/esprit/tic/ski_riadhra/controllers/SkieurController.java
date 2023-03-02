package tn.esprit.tic.ski_riadhra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ski_riadhra.Entities.Skieur;
import tn.esprit.tic.ski_riadhra.repositories.Skieur_repository;
import tn.esprit.tic.ski_riadhra.service.ISkieurService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("skieur")
public class SkieurController {
    @Autowired
    ISkieurService skieurService;
    //localhost:9090
    @GetMapping
    public List<Skieur> getAll() {
        return skieurService.retrieveAllSkieurs();
    }

    @PostMapping("addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }

    @PutMapping("updateSkieur")
    Skieur updateSkieur(@RequestBody Skieur skieur)
    {
        return skieurService.updateSkieur(skieur);
    };
    @GetMapping("{numSkieur}")

    public Skieur retrieveSkieur(@PathVariable Long numSkieur) {

        return  skieurService.retrieveSkieur(numSkieur);

    }



    @DeleteMapping("{numSkieur}")
    void removeSkieur (@PathVariable Long numSkieur)
    {
        skieurService.removeSkieur(numSkieur);
    };


}
