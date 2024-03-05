package fr.domes.domes.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomCategorie;

    @OneToMany(mappedBy = "categorie")
    private Collection <Produit> produit = new ArrayList<>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomCategorie() {
        return nomCategorie;
    }
    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
    public Categorie() {
    }
    public Categorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
    @Override
    public String toString() {
        return "Categorie [id=" + id + ", nomCategorie=" + nomCategorie + "]";
    }

    
}
