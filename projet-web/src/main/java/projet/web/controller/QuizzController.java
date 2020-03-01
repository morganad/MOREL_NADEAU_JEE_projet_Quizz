package projet.web.controller;

import projet.core.entity.Question;
import projet.core.entity.Quizz;
import projet.core.entity.Utilisateur;
import projet.core.service.QuestionService;
import projet.core.service.QuizzService;
import projet.core.service.UtilisateurService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
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

    @Inject
    private QuestionService questionService;

    @GET
    @Path("/quizzs")
    public Map<Long,Quizz> getQuizzs(){
        List<Quizz> quizzs = quizzService.findAll();
        List<Long> firstQuestions= new ArrayList<>();
        int numberQuizz = quizzs.size();
        for (int i=1;i<numberQuizz+1;i++){
            firstQuestions.add(questionService.findFirstQuestion((long) i).getId());
        }
        Map<Long,Quizz> returnedMap = new HashMap<>();
        for(int j=0;j<numberQuizz;j++){
            returnedMap.put(firstQuestions.get(j),quizzs.get(j));
        }
        return returnedMap;
    }


}
