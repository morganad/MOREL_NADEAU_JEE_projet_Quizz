package projet.web.controller;


import org.springframework.web.context.annotation.RequestScope;
import projet.core.ScoreUtilisateur;
import projet.core.entity.*;
import projet.core.service.*;

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

    @Inject
    private ScoreService scoreService;

    @Inject
    private UtilisateurService utilisateurService;

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

    @POST
    @Path("/scores")
    public void saveScore(ScoreUtilisateur scoreUtilisateur){
        int isPresent = utilisateurService.isPresent(scoreUtilisateur.getNom(),scoreUtilisateur.getPrenom());
        long idUtilisateur;
        if (isPresent==0) {
            utilisateurService.saveUtilisateur(scoreUtilisateur.getNom(), scoreUtilisateur.getPrenom());
        }
        idUtilisateur=utilisateurService.getIdByNom(scoreUtilisateur.getNom(),scoreUtilisateur.getPrenom());
        int FirstScore = scoreService.isPresent((long) idUtilisateur);
        if(FirstScore==0){
            scoreService.saveScore(scoreUtilisateur.getScore(),scoreUtilisateur.getScore(),idUtilisateur);
        } else {
            Score score = scoreService.getScoreByUtilisateurId(idUtilisateur);
            int meilleurScore=score.getMeilleur_score();
            if (scoreUtilisateur.getScore()>meilleurScore){
                meilleurScore=scoreUtilisateur.getScore();
            }
            scoreService.upDateScore(meilleurScore,scoreUtilisateur.getScore(),idUtilisateur);
        }

    }

}
