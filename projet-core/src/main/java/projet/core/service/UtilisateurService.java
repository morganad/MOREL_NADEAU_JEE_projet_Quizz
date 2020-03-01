package projet.core.service;

import org.springframework.beans.factory.annotation.Autowired;
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

    public long getIdByNom(String nom, String prenom){ return  utilisateurDAO.getIdByNom(nom,prenom);}

    public int isPresent(String nom, String prenom) {return  utilisateurDAO.isPresent(nom,prenom);
    }

    public void saveUtilisateur(String nom, String prenom) { utilisateurDAO.saveUtilisateur(nom,prenom);
    }

    public Utilisateur getUtilisateurById(long utilisateur_id) { return  utilisateurDAO.getUtilisateurById(utilisateur_id);
    }
}

