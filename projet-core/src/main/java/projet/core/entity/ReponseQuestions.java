package projet.core.entity;

import javax.persistence.*;

@Entity
public class ReponseQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String reponse;

    private Boolean est_correct;

    @ManyToOne
    private Question question;

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

    public Boolean getEst_correct() {
        return est_correct;
    }

    public void setEst_correct(Boolean est_correct) {
        this.est_correct = est_correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public ReponseQuestions() {
    }
}
