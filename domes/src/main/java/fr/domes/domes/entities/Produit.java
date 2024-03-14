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
    public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public Collection<Article> getArticle() {
        return article;
    }
    public void setArticle(Collection<Article> article) {
        this.article = article;
    }
    public Produit() {
    }
   
    public Produit(Long id, String nomProduit, Categorie categorie, Collection<Article> article) {
        this.id = id;
        this.nomProduit = nomProduit;
        this.categorie = categorie;
        this.article = article;
    }
    @Override
    public String toString() {
        return "Produit [id=" + id + ", nomProduit=" + nomProduit + ", categorie=" + categorie + ", article=" + article
                + "]";
    }
   
    

    
}
