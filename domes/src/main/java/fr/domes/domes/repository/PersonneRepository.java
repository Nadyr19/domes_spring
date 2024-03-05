package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
