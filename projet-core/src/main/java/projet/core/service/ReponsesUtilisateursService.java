package projet.core.service;


import org.springframework.stereotype.Service;
import projet.core.dao.ReponsesUtilisateursDAO;
import projet.core.entity.ReponsesQuestions;
import projet.core.entity.ReponsesUtilisateurs;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReponsesUtilisateursService {

    private ReponsesUtilisateursDAO reponsesUtilisateursDAO;

    public ReponsesUtilisateursService(final ReponsesUtilisateursDAO reponsesUtilisateursDAO) { this.reponsesUtilisateursDAO = reponsesUtilisateursDAO; }

    public void saveReponseUtilisateur(final long reponse) {
        reponsesUtilisateursDAO.saveReponseUtilisateur(reponse);

    }

    public List<ReponsesUtilisateurs> findAll() { return reponsesUtilisateursDAO.findAll();
    }

    public void deleteAll() {
        reponsesUtilisateursDAO.deleteAll();
    }
}
