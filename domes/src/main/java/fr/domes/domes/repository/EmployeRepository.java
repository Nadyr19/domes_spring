package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Employe;

public interface EmployeRepository extends JpaRepository <Employe, Long> {

}
