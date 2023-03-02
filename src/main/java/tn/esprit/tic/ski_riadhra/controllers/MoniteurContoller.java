package tn.esprit.tic.ski_riadhra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ski_riadhra.Entities.Moniteur;
import tn.esprit.tic.ski_riadhra.service.IMoniteurService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("moniteur")
public class MoniteurContoller {
@Autowired
    IMoniteurService MoniteurService;

@GetMapping
public List<Moniteur> getAll(){
    return MoniteurService.retrieveAllMoniteurs();

}
    @GetMapping("{numMoniteur}")

    public Optional<Moniteur> retrieveMoniteur(@PathVariable Long numMoniteur) {

        return  MoniteurService.retrieveMoniteur(numMoniteur);

    }
    @PostMapping

    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){

        return MoniteurService.addMoniteur(moniteur);
    }
    @DeleteMapping("{numMoniteur}")
    public void removeMoniteur(@PathVariable Long numMoniteur){

        MoniteurService.removeMoniteur(numMoniteur);
    }

    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur Moniteur) {

        return  MoniteurService.updateMoniteur(Moniteur);

    }

}
