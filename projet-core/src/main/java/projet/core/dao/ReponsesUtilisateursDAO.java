package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.core.entity.ReponsesUtilisateurs;

public interface ReponsesUtilisateursDAO extends JpaRepository<ReponsesUtilisateurs, Long> {
}