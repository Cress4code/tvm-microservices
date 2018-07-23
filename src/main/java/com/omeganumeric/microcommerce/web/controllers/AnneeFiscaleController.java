package com.omeganumeric.microcommerce.web.controllers;

import com.omeganumeric.microcommerce.models.AnneeFiscale;
import com.omeganumeric.microcommerce.repositories.AnneeFiscaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/annee-fiscale")
public class AnneeFiscaleController {
    @Autowired
    private AnneeFiscaleRepository anneeFiscaleRepository;

    @GetMapping("")
    public List<AnneeFiscale> getAllAnneeFiscale() {

        return anneeFiscaleRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<AnneeFiscale> saveAnneeFiscale(@Valid @RequestBody AnneeFiscale anneeFiscale) {
        AnneeFiscale anneeFiscale1 = anneeFiscaleRepository.save(anneeFiscale);

        return ResponseEntity.created(null).body(anneeFiscale1);

    }


    @PutMapping("/{reference}")
    public ResponseEntity<AnneeFiscale> modifyAnneeFiscale(@PathVariable String reference, @RequestBody AnneeFiscale anneeFiscale) {
        AnneeFiscale anneeFiscale1 = anneeFiscaleRepository.findByReferenceAnneeFiscale(reference);
        if (anneeFiscale1 != null) {
            anneeFiscale.setId(anneeFiscale1.getId());
            anneeFiscaleRepository.save(anneeFiscale);
            return ResponseEntity.ok().body(anneeFiscale);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{reference}")
    public ResponseEntity<AnneeFiscale> getAnneeFiscale(@PathVariable String reference) {
        AnneeFiscale critere = anneeFiscaleRepository.findByReferenceAnneeFiscale(reference);
        if (critere != null) {
            return ResponseEntity.ok().body(critere);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{reference}")
    public ResponseEntity<Void> deleteCritereCode(@PathVariable String reference) {
        AnneeFiscale critere = anneeFiscaleRepository.findByReferenceAnneeFiscale(reference);

        if (critere != null) {
            anneeFiscaleRepository.delete(critere);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
