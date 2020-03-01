package projet.web.controller;


import projet.core.entity.Question;
import projet.core.entity.ReponsesQuestions;
import projet.core.entity.ReponsesUtilisateurs;
import projet.core.entity.Utilisateur;
import projet.core.service.QuestionService;
import projet.core.service.ReponsesQuestionsService;
import projet.core.service.ReponsesUtilisateursService;
import projet.core.service.UtilisateurService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.toIntExact;

@Named
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ScoreController implements RestController {

    @Inject
    private ReponsesUtilisateursService reponsesUtilisateursService;

    @Inject
    private ReponsesQuestionsService reponsesQuestionsService;

    @Inject
    private QuestionService questionService;

    @GET
    @Path("/resultats/{quizzId}")
    public Map<Integer,Integer> getResultat(@PathParam("quizzId") long quizzId){
        List<ReponsesUtilisateurs> reponsesUtilisateurs = reponsesUtilisateursService.findAll();
        List<ReponsesQuestions> reponsesQuestions = reponsesQuestionsService.findALl();
        int nbrQuestions = questionService.findAllQuestionsFromQuizz(quizzId).size();
        int score= 0;
        Map<Integer,Integer> returnedMap = new HashMap<>(); //liste à deux élement (nbr de réponses justes, nbr de questions)
        for(ReponsesUtilisateurs reponsesUtilisateurs1:reponsesUtilisateurs){
            if (reponsesQuestions.get(toIntExact(reponsesUtilisateurs1.getReponse_question_id())-1).getEst_correct()==1){
                score++;
            }
        }
        returnedMap.put(score,nbrQuestions);
        return returnedMap;
    }

}
