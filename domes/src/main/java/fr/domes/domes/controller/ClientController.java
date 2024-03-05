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

import fr.domes.domes.entities.Client;
import fr.domes.domes.services.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    
    @Autowired
 private ClientService clientService;

 @GetMapping
 public List<Client> getAllClient() {
 return clientService.getAllClients();
 }

 @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
 
@PostMapping
 public Client addClient(@RequestBody Client client) {
 return clientService.addClient(client);
}



     @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client updatedClient) {
        return clientService.updateClient(id, updatedClient);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
// Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


