package projet.core.entity;

import javax.persistence.*;

@Entity
public class ReponseUtilisateursTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private ReponseQuestions reponseQuestionsList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ReponseQuestions getReponseQuestionsList() {
        return reponseQuestionsList;
    }

    public void setReponseQuestionsList(ReponseQuestions reponseQuestionsList) {
        this.reponseQuestionsList = reponseQuestionsList;
    }

    public ReponseUtilisateursTest() {
    }
}

