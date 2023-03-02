package tn.esprit.tic.ski_riadhra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ski_riadhra.Entities.Piste;
import tn.esprit.tic.ski_riadhra.service.IPisteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("piste")
public class PisteController {
    @Autowired
    IPisteService PisteService;
    @GetMapping
    public List<Piste> getAll() {
        return PisteService.retrieveAllPistes();
    }
    @GetMapping("{numPiste}")

    public Optional<Piste> retrievePiste(@PathVariable Long numPiste) {

        return  PisteService.retrievePiste(numPiste);

    }
    @PostMapping

    public Piste addPiste(@RequestBody Piste piste){

        return PisteService.addPiste(piste);
    }
    @DeleteMapping("{numpiste}")
    public void removePiste(@PathVariable Long numpiste){

        PisteService.removePiste(numpiste);
    }
    @PutMapping
    public Piste updatePiste(@RequestBody Piste Piste) {

        return  PisteService.updatePiste(Piste);

    }


}
