package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.Categorie;
import fr.domes.domes.repository.CategorieRepository;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    public Categorie getCategorieById(Long id) {
        return categorieRepository.findById(id).orElse(null);
    }

    public Categorie addCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public Categorie updateCategorie(Long id, Categorie updatedCategorie) {
        Optional<Categorie> existingCategorie = categorieRepository.findById(id);
        if (existingCategorie.isPresent()) {
            Categorie categorie = existingCategorie.get();
            categorie.setNomCategorie(updatedCategorie.getNomCategorie());
            return categorieRepository.save(categorie);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }

    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


}
