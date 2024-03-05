package fr.domes.domes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.domes.domes.entities.Article;

public interface ArticleRepository extends JpaRepository <Article, Long>{

}
