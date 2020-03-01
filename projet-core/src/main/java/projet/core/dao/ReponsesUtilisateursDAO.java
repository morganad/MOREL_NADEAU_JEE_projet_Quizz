package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projet.core.entity.Question;
import projet.core.entity.ReponsesQuestions;
import projet.core.entity.ReponsesUtilisateurs;

import java.util.List;

public interface ReponsesUtilisateursDAO extends JpaRepository<ReponsesUtilisateurs, Long> {

    @Modifying
    @Query(
            value = "INSERT INTO reponsesutilisateurs (reponse_question_id) VALUE (:reponse_question_id)",
            nativeQuery = true)
    void saveReponseUtilisateur(@Param("reponse_question_id") long reponseId);
}
