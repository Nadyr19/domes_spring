package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Commande;

public interface CommandeRepository extends JpaRepository <Commande, Long>{

}
