package projet.web.controller;

import projet.core.entity.Quizz;
import projet.core.entity.Utilisateur;
import projet.core.service.QuizzService;
import projet.core.service.UtilisateurService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class QuizzController implements RestController{

    @Inject
    private QuizzService quizzService;

    @GET
    @Path("/quizzs")
    public Map<Long,String> getQuizzs(){
        List<Quizz> quizzs = quizzService.findAll();
        Map<Long,String> returnedMap = new HashMap<>();
        for(Quizz quizz:quizzs){
            returnedMap.put(quizz.getId(),quizz.getTitre());
        }
        for (Quizz quizz:quizzs) {
            System.out.println(quizz);
        }

        return returnedMap;
    }


}
