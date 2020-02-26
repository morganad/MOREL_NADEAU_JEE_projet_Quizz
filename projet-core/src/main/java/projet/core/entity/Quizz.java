package projet.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quizz implements Comparable<Quizz> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titre;

    public Quizz() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public int compareTo(Quizz o) {
        return 0;
    }
}
