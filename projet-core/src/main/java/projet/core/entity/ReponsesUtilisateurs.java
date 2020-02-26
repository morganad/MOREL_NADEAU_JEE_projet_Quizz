package projet.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReponsesUtilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long reponse_question_id;

    public ReponsesUtilisateurs() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getReponse_question_id() {
        return reponse_question_id;
    }

    public void setReponse_question_id(long reponse_question_id) {
        this.reponse_question_id = reponse_question_id;
    }
}
