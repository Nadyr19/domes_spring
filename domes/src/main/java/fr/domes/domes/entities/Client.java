package fr.domes.domes.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Client extends Personne {

    private String numTel;
    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Collection<Commande> commande = new ArrayList<>();

    @OneToOne(mappedBy = "client", fetch = FetchType.LAZY)
    private Login login;

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Collection<Commande> getCommande() {
        return commande;
    }

    public void setCommande(Collection<Commande> commande) {
        this.commande = commande;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    

    public Client() {
    }
    
    /* 
    public Client(String numTel, Adresse adresse, Collection<Commande> commande, Login login) {
        this.numTel = numTel;
        this.adresse = adresse;
        this.commande = commande;
        this.login = login;
    }

*/

    public Client(Long id, String nom, String prenom, java.util.Date dateNaissance, String numTel, Adresse adresse,
            Collection<Commande> commande, Login login) {
        super(id, nom, prenom, dateNaissance);
        this.numTel = numTel;
        this.adresse = adresse;
        this.commande = commande;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Client [numTel=" + numTel + ", adresse=" + adresse + ", commande=" + commande + ", login=" + login
                + "]";
    }

    

   

}
