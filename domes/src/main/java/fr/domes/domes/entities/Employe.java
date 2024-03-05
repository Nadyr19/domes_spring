package fr.domes.domes.entities;

import java.util.Date;

import jakarta.persistence.Entity;


@Entity
public class Employe extends Personne {

    
    private Date dateEntree;
   
    public Date getDateEntree() {
        return dateEntree;
    }
    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }
    
    public Employe() {
    }
    public Employe(Date dateEntree) {
        this.dateEntree = dateEntree;
    }
    public Employe(String nom, String prenom, java.sql.Date dateNaissance, Date dateEntree) {
        super(nom, prenom, dateNaissance);
        this.dateEntree = dateEntree;
    }
    @Override
    public String toString() {
        return "Employe [dateEntree=" + dateEntree + "]";
    }
    


    

}
