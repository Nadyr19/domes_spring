package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
