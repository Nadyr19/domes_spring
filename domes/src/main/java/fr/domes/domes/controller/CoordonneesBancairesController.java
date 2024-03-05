package fr.domes.domes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.domes.domes.entities.CoordonneesBancaires;
import fr.domes.domes.services.CoordonneesBancairesService;


@RestController
@RequestMapping("/api/coordonneesbancaires")
public class CoordonneesBancairesController {

    
    @Autowired
    private CoordonneesBancairesService coordonneesBancairesService;

    @GetMapping
    public List<CoordonneesBancaires> getAllCoordonneesBancaires() {
        return coordonneesBancairesService.getAllCoordonneesBancaires();
    }

    @GetMapping("/{id}")
    public CoordonneesBancaires getCoordonneesBancairesById(@PathVariable Long id) {
        return coordonneesBancairesService.getCoordonneesBancairesById(id);
    }

    @PostMapping
    public CoordonneesBancaires addCoordonneesBancaires(@RequestBody CoordonneesBancaires coordonneesBancaires) {
        return coordonneesBancairesService.addCoordonneesBancaires(coordonneesBancaires);
    }

    @PutMapping("/{id}")
    public CoordonneesBancaires updateCoordonneesBancaires(@PathVariable Long id, @RequestBody CoordonneesBancaires updatedCoordonneesBancaires) {
        return coordonneesBancairesService.updateCoordonneesBancaires(id, updatedCoordonneesBancaires);
    }

    @DeleteMapping("/{id}")
    public void deleteCoordonneesBancaires(@PathVariable Long id) {
        coordonneesBancairesService.deleteCoordonneesBancaires(id);
    }
}
// Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


