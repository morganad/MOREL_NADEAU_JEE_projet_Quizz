package projet.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Score implements Comparable<Score> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int dernier_score;
    private int meilleur_score;
    private long utilisateur_id;

    public Score() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDernier_score() {
        return dernier_score;
    }

    public void setDernier_score(int dernier_score) {
        this.dernier_score = dernier_score;
    }

    public int getMeilleur_score() {
        return meilleur_score;
    }

    public void setMeilleur_score(int meilleur_score) {
        this.meilleur_score = meilleur_score;
    }

    public long getUtilisateur_id() {
        return utilisateur_id;
    }

    public void setUtilisateur_id(long utilisateur_id) {
        this.utilisateur_id = utilisateur_id;
    }

    @Override
    public int compareTo(Score o) {
        return 0;
    }
}
