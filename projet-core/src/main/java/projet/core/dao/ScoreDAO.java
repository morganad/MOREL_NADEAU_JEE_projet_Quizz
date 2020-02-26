package projet.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.core.entity.Score;

public interface ScoreDAO extends JpaRepository<Score, Long> {
}
