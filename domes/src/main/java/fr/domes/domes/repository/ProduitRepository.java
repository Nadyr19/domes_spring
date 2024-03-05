package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Produit;

public interface ProduitRepository extends JpaRepository <Produit, Long> {

}
