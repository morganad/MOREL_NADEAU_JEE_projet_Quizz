package projet.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Comparable<Utilisateur> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String prenom;
    private String nom;

    public Utilisateur() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return prenom +" "+nom;
    }

    @Override
    public int compareTo(Utilisateur o) {
        return 0;
    }
}
