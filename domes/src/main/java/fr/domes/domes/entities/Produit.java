package fr.domes.domes.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Produit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProduit;

    @ManyToOne
    private Categorie categorie;

    @OneToMany(mappedBy = "produit")
    private Collection <Article> article = new ArrayList<>();
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomProduit() {
        return nomProduit;
    }
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    public Produit() {
    }
    public Produit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    @Override
    public String toString() {
        return "Produit [id=" + id + ", nomProduit=" + nomProduit + "]";
    }

    
}
