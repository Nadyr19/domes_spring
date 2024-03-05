package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.Login;
import fr.domes.domes.repository.LoginRepository;

@Service
public class LoginService {

     @Autowired
    private LoginRepository loginRepository;

    public List<Login> getAllLogins() {
        return loginRepository.findAll();
    }

    public Login getLoginById(Long id) {
        return loginRepository.findById(id).orElse(null);
    }

    public Login addLogin(Login login) {
        return loginRepository.save(login);
    }

    public Login updateLogin(Long id, Login updatedLogin) {
        Optional<Login> existingLogin = loginRepository.findById(id);
        if (existingLogin.isPresent()) {
            Login login = existingLogin.get();
            login.setEmail(updatedLogin.getEmail());
            login.setPassword(updatedLogin.getPassword());
            return loginRepository.save(login);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }

    public void deleteLogin(Long id) {
        loginRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


}
