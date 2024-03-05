package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.CoordonneesBancaires;
import fr.domes.domes.repository.CoordonneesBancairesRepository;


@Service
public class CoordonneesBancairesService {

     @Autowired
    private CoordonneesBancairesRepository coordonneesBancairesRepository;

    public List<CoordonneesBancaires> getAllCoordonneesBancaires() {
        return coordonneesBancairesRepository.findAll();
    }

    public CoordonneesBancaires getCoordonneesBancairesById(Long id) {
        return coordonneesBancairesRepository.findById(id).orElse(null);
    }

    public CoordonneesBancaires addCoordonneesBancaires(CoordonneesBancaires coordonneesBancaires) {
        return coordonneesBancairesRepository.save(coordonneesBancaires);
    }

    public CoordonneesBancaires updateCoordonneesBancaires(Long id, CoordonneesBancaires updatedCoordonneesBancaires) {
        Optional<CoordonneesBancaires> existingCoordonneesBancaires = coordonneesBancairesRepository.findById(id);
        if (existingCoordonneesBancaires.isPresent()) {
            CoordonneesBancaires coordonneesBancaires = existingCoordonneesBancaires.get();
            coordonneesBancaires.setNumCarte(updatedCoordonneesBancaires.getNumCarte());
            coordonneesBancaires.setNomTitulaireCarte(updatedCoordonneesBancaires.getNomTitulaireCarte());
            coordonneesBancaires.setDateExpiration(updatedCoordonneesBancaires.getDateExpiration());
            return coordonneesBancairesRepository.save(coordonneesBancaires);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }

    public void deleteCoordonneesBancaires(Long id) {
        coordonneesBancairesRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


}
