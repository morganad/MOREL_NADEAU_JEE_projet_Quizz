package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.core.entity.Utilisateur;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Long> {
}
