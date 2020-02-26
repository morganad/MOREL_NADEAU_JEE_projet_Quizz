package projet.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions implements Comparable<Questions> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String intitule;
    private long quizz_id;

    public Questions() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public long getQuizz_id() {
        return quizz_id;
    }

    public void setQuizz_id(long quizz_id) {
        this.quizz_id = quizz_id;
    }

    @Override
    public int compareTo(Questions o) {
        return 0;
    }
}
