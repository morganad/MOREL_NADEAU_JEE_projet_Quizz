package projet.web.controller;

import projet.core.entity.Score;
import projet.core.entity.Utilisateur;
import projet.core.service.ScoreService;
import projet.core.service.UtilisateurService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UtilisateurController implements RestController {

    @Inject
    private UtilisateurService utilisateurService;

    @Inject
    private ScoreService scoreService;

    @GET
    @Path("/utilisateurs")
    public Map<Long,String> getUtilisateurs(){
        List<Utilisateur> utilisateurs = utilisateurService.findAll();
        Map<Long,String> returnedMap = new HashMap<>();
        for(Utilisateur utilisateur:utilisateurs){
            returnedMap.put(utilisateur.getId(),utilisateur.getNom()+" "+utilisateur.getPrenom());
        }
        for (Utilisateur utilisateur:utilisateurs) {
            System.out.println(utilisateur);
        }

        return returnedMap;
    }

    @GET
    @Path("/scoresList")
    public Map<String, Score> getScores(){
        List<Score> scores= scoreService.findAll();
        List<Utilisateur> utilisateurs = new ArrayList<>();
        for (Score score:scores){
            utilisateurs.add(utilisateurService.getUtilisateurById(score.getUtilisateur_id()));
        }
        List<String> nomPrenom = new ArrayList<>();
        for (Utilisateur utilisateur:utilisateurs){
            nomPrenom.add(utilisateur.getNom()+" "+utilisateur.getPrenom());
        }
        Map<String,Score> returnedMap = new HashMap<>();
        for(int i=0;i<scores.size();i++){
            returnedMap.put(nomPrenom.get(i),scores.get(i));
        }
        return returnedMap;
    }
}
