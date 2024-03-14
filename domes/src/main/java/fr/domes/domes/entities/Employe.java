package fr.domes.domes.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;


@Entity
public class Employe extends Personne {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEntree;
    
    public Date getDateEntree() {
        return dateEntree;
    }
    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }
    
    public Employe() {
    }
    public Employe(Long id, String nom, String prenom, Date dateNaissance, Date dateEntree) {
        super(id, nom, prenom, dateNaissance);
        this.dateEntree = dateEntree;
    }
    @Override
    public String toString() {
        return "Employe [dateEntree=" + dateEntree + "]";
    }
    
    


    

}
