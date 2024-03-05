package fr.domes.domes.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCommande;
    private Date dateExpedition;

    @ManyToOne
    private Client client;

    @ManyToMany(mappedBy= "commande", fetch = FetchType.EAGER)
    private Collection <Article> article = new ArrayList<>();
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDateCommande() {
        return dateCommande;
    }
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
    public Date getDateExpedition() {
        return dateExpedition;
    }
    public void setDateExpedition(Date dateExpedition) {
        this.dateExpedition = dateExpedition;
    }
    public Commande() {
    }
    
  
    
  
    public Commande(Long id, Date dateCommande, Date dateExpedition) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.dateExpedition = dateExpedition;
    }
    public Commande(Long id, Date dateCommande, Date dateExpedition, Client client, Collection<Article> article) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.dateExpedition = dateExpedition;
        this.client = client;
        this.article = article;
    }
    @Override
    public String toString() {
        return "Commande [id=" + id + ", dateCommande=" + dateCommande + ", dateExpedition=" + dateExpedition
                + ", client=" + client + ", article=" + article + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((dateCommande == null) ? 0 : dateCommande.hashCode());
        result = prime * result + ((dateExpedition == null) ? 0 : dateExpedition.hashCode());
        result = prime * result + ((client == null) ? 0 : client.hashCode());
        result = prime * result + ((article == null) ? 0 : article.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Commande other = (Commande) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (dateCommande == null) {
            if (other.dateCommande != null)
                return false;
        } else if (!dateCommande.equals(other.dateCommande))
            return false;
        if (dateExpedition == null) {
            if (other.dateExpedition != null)
                return false;
        } else if (!dateExpedition.equals(other.dateExpedition))
            return false;
        if (client == null) {
            if (other.client != null)
                return false;
        } else if (!client.equals(other.client))
            return false;
        if (article == null) {
            if (other.article != null)
                return false;
        } else if (!article.equals(other.article))
            return false;
        return true;
    }
    

    

    
}
