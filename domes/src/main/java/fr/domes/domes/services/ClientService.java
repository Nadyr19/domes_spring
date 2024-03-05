package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.Client;
import fr.domes.domes.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @SuppressWarnings("null")
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @SuppressWarnings("null")
    public Client updateClient(Long id, Client updatedClient) {
        Optional<Client> existingClient = clientRepository.findById(id);
        if (existingClient.isPresent()) {
            Client client = existingClient.get();
            client.setNom(updatedClient.getNom());
            client.setPrenom(updatedClient.getPrenom());
            client.setDateNaissance(updatedClient.getDateNaissance());
            client.setNumTel(updatedClient.getNumTel());
            client.setAdresse(updatedClient.getAdresse());
            return clientRepository.save(client);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }


    @SuppressWarnings("null")
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.
}
