package projet.core.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String intitule;

    @ManyToOne
    private Quizz quizz;

    @OneToMany(mappedBy = "question")
    private List<ReponseQuestions> reponseQuestionsList;

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

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

    public List<ReponseQuestions> getReponseQuestionsList() {
        return reponseQuestionsList;
    }

    public void setReponseQuestionsList(List<ReponseQuestions> reponseQuestionsList) {
        this.reponseQuestionsList = reponseQuestionsList;
    }

    public Question() {
    }
}
