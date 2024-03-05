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

import fr.domes.domes.entities.Login;
import fr.domes.domes.services.LoginService;

@RestController
@RequestMapping("/api/logins")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public List<Login> getAllLogins() {
        return loginService.getAllLogins();
    }

    @GetMapping("/{id}")
    public Login getLoginById(@PathVariable Long id) {
        return loginService.getLoginById(id);
    }

    @PostMapping
    public Login addLogin(@RequestBody Login login) {
        return loginService.addLogin(login);
    }

    @PutMapping("/{id}")
    public Login updateLogin(@PathVariable Long id, @RequestBody Login updatedLogin) {
        return loginService.updateLogin(id, updatedLogin);
    }

    @DeleteMapping("/{id}")
    public void deleteLogin(@PathVariable Long id) {
        loginService.deleteLogin(id);
    }
}
// Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.
