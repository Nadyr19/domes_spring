package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.Personne;
import fr.domes.domes.repository.PersonneRepository;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personneRepository;

    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }

    public Personne getPersonneById(Long id) {
        return personneRepository.findById(id).orElse(null);
    }

    public Personne addPersonne(Personne personne) {
        return personneRepository.save(personne);
    }

    public Personne updatePersonne(Long id, Personne updatedPersonne) {
        Optional<Personne> existingPersonne = personneRepository.findById(id);
        if (existingPersonne.isPresent()) {
            Personne personne = existingPersonne.get();
            personne.setNom(updatedPersonne.getNom());
            personne.setPrenom(updatedPersonne.getPrenom());
            personne.setDateNaissance(updatedPersonne.getDateNaissance());
            return personneRepository.save(personne);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }

    public void deletePersonne(Long id) {
        personneRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


}
