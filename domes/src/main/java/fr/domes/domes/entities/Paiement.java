package fr.domes.domes.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datePaiement;
    private double montant;

    @OneToOne(mappedBy = "paiement")
    private CoordonneesBancaires coordonneesBancaires;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDatePaiement() {
        return datePaiement;
    }
    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public CoordonneesBancaires getCoordonneesBancaires() {
        return coordonneesBancaires;
    }
    public void setCoordonneesBancaires(CoordonneesBancaires coordonneesBancaires) {
        this.coordonneesBancaires = coordonneesBancaires;
    }
    public Paiement() {
    }
    public Paiement(Date datePaiement, double montant, CoordonneesBancaires coordonneesBancaires) {
        this.datePaiement = datePaiement;
        this.montant = montant;
        this.coordonneesBancaires = coordonneesBancaires;
    }
    @Override
    public String toString() {
        return "Paiement [id=" + id + ", datePaiement=" + datePaiement + ", montant=" + montant
                + ", coordonneesBancaires=" + coordonneesBancaires + "]";
    }

    


}
