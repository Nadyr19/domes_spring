package fr.domes.domes.entities;


import jakarta.persistence.Embeddable;


@Embeddable
public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public Adresse() {
    }
    public Adresse(String rue, String ville, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }
    @Override
    public String toString() {
        return "Adresse [rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + "]";
    }
    
    
}
