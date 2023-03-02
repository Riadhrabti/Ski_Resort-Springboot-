package tn.esprit.tic.ski_riadhra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ski_riadhra.Entities.Cours;
import tn.esprit.tic.ski_riadhra.service.ICoursService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cours")

public class CoursController {

    @Autowired
    ICoursService CoursService;

    @GetMapping
    public List<Cours> getAll() {
        return CoursService.retrieveAllCours();

    }

    @GetMapping("{numCours}")

    public Optional<Cours> retrieveCours(@PathVariable Long numCours) {

        return CoursService.retrieveCours(numCours);

    }

    @PostMapping

    public Cours addCours(@RequestBody Cours cours) {

        return CoursService.addCours(cours);
    }

    @DeleteMapping("{numCours}")
    public void removeCours(@PathVariable Long numCours) {

        CoursService.removeCours(numCours);
    }

    @PutMapping
    public Cours updateCours(@RequestBody Cours Cours) {

        return CoursService.updateCours(Cours);

    }
}