package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Login;

public interface LoginRepository extends JpaRepository <Login, Long> {

}
