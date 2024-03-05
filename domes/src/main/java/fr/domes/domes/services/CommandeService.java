package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.Commande;
import fr.domes.domes.repository.CommandeRepository;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    public Commande getCommandeById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    public Commande updateCommande(Long id, Commande updatedCommande) {
        Optional<Commande> existingCommande = commandeRepository.findById(id);
        if (existingCommande.isPresent()) {
            Commande commande = existingCommande.get();
            commande.setDateCommande(updatedCommande.getDateCommande());
            commande.setDateExpedition(updatedCommande.getDateExpedition());
            return commandeRepository.save(commande);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }

    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.

}
