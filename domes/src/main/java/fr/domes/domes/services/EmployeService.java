package fr.domes.domes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.domes.domes.entities.Employe;
import fr.domes.domes.repository.EmployeRepository;


@Service
public class EmployeService {

     @Autowired
    private EmployeRepository employeRepository;

    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public Employe updateEmploye(Long id, Employe updatedEmploye) {
        Optional<Employe> existingEmploye = employeRepository.findById(id);
        if (existingEmploye.isPresent()) {
            Employe employe = existingEmploye.get();
            employe.setNom(updatedEmploye.getNom());
            employe.setPrenom(updatedEmploye.getPrenom());
            employe.setDateNaissance(updatedEmploye.getDateNaissance());
            employe.setDateEntree(updatedEmploye.getDateEntree());
            return employeRepository.save(employe);
        }
        return null; // Gérer le cas où la personne n'est pas trouvée
    }

    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }
    // Ajouter d'autres méthodes pour mettre à jour, supprimer, etc.


}
