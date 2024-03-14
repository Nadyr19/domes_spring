package fr.domes.domes.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CoordonneesBancaires {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String numCarte;
     private Date dateExpiration;
     private String nomTitulaireCarte;

     @OneToOne(fetch = FetchType.LAZY)
     private Paiement paiement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(String numCarte) {
        this.numCarte = numCarte;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getNomTitulaireCarte() {
        return nomTitulaireCarte;
    }
    
    public void setNomTitulaireCarte(String nomTitulaireCarte) {
        this.nomTitulaireCarte = nomTitulaireCarte;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    

    
    public CoordonneesBancaires() {
    }

    public CoordonneesBancaires(Long id, String numCarte, Date dateExpiration, String nomTitulaireCarte,
            Paiement paiement) {
        this.id = id;
        this.numCarte = numCarte;
        this.dateExpiration = dateExpiration;
        this.nomTitulaireCarte = nomTitulaireCarte;
        this.paiement = paiement;
    }

    @Override
    public String toString() {
        return "CoordonneesBancaires [id=" + id + ", numCarte=" + numCarte + ", dateExpiration=" + dateExpiration
                + ", nomTitulaireCarte=" + nomTitulaireCarte + ", paiement=" + paiement + "]";
    }

    
    
     

}
