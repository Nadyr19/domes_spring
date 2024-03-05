package fr.domes.domes.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomArticle;

    @ManyToOne
    private Produit produit;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Commande> commande = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Collection<Commande> getCommande() {
        return commande;
    }

    public void setCommande(Collection<Commande> commande) {
        this.commande = commande;
    }

    public Article() {
    }

    public Article(Long id, String nomArticle, Produit produit, Collection<Commande> commande) {
        this.id = id;
        this.nomArticle = nomArticle;
        this.produit = produit;
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", nomArticle=" + nomArticle + ", produit=" + produit + ", commande=" + commande
                + "]";
    }

}
