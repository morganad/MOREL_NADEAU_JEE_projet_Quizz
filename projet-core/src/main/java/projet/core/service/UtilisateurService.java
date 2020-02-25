package projet.core.service;

import org.springframework.stereotype.Service;
import projet.core.dao.UtilisateurDAO;
import projet.core.entity.Utilisateur;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UtilisateurService {

    private UtilisateurDAO utilisateurDAO;

    public UtilisateurService(final UtilisateurDAO utilisateurDAO) { this.utilisateurDAO = utilisateurDAO; }

    public List<Utilisateur> findAll() { return utilisateurDAO.findAll(); }

}
