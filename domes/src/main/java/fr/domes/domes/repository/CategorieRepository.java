package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Categorie;

public interface CategorieRepository extends JpaRepository <Categorie, Long> {

}
