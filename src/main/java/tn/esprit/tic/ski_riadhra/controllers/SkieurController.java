package tn.esprit.tic.ski_riadhra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.ski_riadhra.Entities.Skieur;
import tn.esprit.tic.ski_riadhra.service.ISkieurService;

import java.util.List;

@RestController
public class SkieurController {
    @Autowired
    ISkieurService ISkieurService;
    //localhost:9090
    @GetMapping("retrieveAllSkieurs")
    public List<Skieur> getAll() {
    return ISkieurService.retrieveAllSkieurs();
    }
    @PostMapping("addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur){
        return ISkieurService.addSkieur(skieur);
    }
}
