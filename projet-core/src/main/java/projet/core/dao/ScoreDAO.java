package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projet.core.entity.Score;

public interface ScoreDAO extends JpaRepository<Score, Long> {

    @Query(
            value = "SELECT COUNT(*) FROM score s WHERE s.utilisateur_id=:utilisateur_id",
            nativeQuery = true)
    int isPresent(@Param("utilisateur_id") long utilisateurId);

    @Query(
            value = "SELECT * FROM score s WHERE s.utilisateur_id=:utilisateur_id ",
            nativeQuery = true)
    Score getScoreByUtilisateurId(@Param("utilisateur_id") long utilisateurId );

    @Modifying
    @Query(
            value = "INSERT INTO score (meilleur_score,dernier_score,utilisateur_id ) VALUES (:meilleur_score,:dernier_score,:utilisateur_id)",
            nativeQuery = true)
    void saveScore(@Param("meilleur_score") int meilleur_score, @Param("dernier_score") int dernier_score,@Param("utilisateur_id") long idUtilisateur);

    @Modifying
    @Query(
            value = "UPDATE score s SET s.meilleur_score=:meilleur_score, s.dernier_score=:dernier_score WHERE s.utilisateur_id=:utilisateur_id",
            nativeQuery = true)
    void updateScore(@Param("meilleur_score") int meilleurScore,@Param("dernier_score") int dernierScore,@Param("utilisateur_id") long idUtilisateur);
}
