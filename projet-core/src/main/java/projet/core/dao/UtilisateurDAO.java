package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import projet.core.entity.Utilisateur;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Long> {

    @Query(
            value = "SELECT COUNT(*) FROM utilisateur u WHERE u.nom=:nom and u.prenom=:prenom",
            nativeQuery = true)
    int isPresent(@Param("nom") String nom, @Param("prenom") String prenom);

    @Query(
            value = "SELECT * FROM utilisateur u WHERE u.nom=:nom and u.prenom=:prenom",
            nativeQuery = true)
    long getIdByNom(@Param("nom") String nom, @Param("prenom") String prenom);

    @Modifying
    @Query(
            value = "INSERT INTO utilisateur (nom,prenom) VALUES (:nom,:prenom)",
            nativeQuery = true)
    void saveUtilisateur(@Param("nom") String nom, @Param("prenom") String prenom);

    @Query(
            value = "SELECT * FROM utilisateur u WHERE u.id=:id",
            nativeQuery = true)
    Utilisateur getUtilisateurById(@Param("id") long id);
}
