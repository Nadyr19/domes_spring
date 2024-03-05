package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Paiement;

public interface PaiementRepository extends JpaRepository <Paiement, Long>{

}
