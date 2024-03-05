package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.Paiement;
import fr.domes.domes.repository.PaiementRepository;

@Service
public class PaiementService {

     @Autowired
    private PaiementRepository paiementRepository;

    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    public Paiement getPaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public Paiement updatePaiement(Long id, Paiement updatedPaiement) {
        Optional<Paiement> existingPaiement = paiementRepository.findById(id);
        if (existingPaiement.isPresent()) {
            Paiement paiement = existingPaiement.get();
            paiement.setMontant(updatedPaiement.getMontant());
            paiement.setDatePaiement(updatedPaiement.getDatePaiement());
            return paiementRepository.save(paiement);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }

    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


}
