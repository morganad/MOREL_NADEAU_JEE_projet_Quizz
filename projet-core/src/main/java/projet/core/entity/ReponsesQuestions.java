package projet.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReponsesQuestions implements Comparable<ReponsesQuestions> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String reponse;
    private int est_correct;
    private long question_id;

    public ReponsesQuestions() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public int getEst_correct() {
        return est_correct;
    }

    public void setEst_correct(int est_correct) {
        this.est_correct = est_correct;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    @Override
    public int compareTo(ReponsesQuestions o) {
        return 0;
    }
}
