package projet.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import projet.core.entity.Question;
import projet.core.entity.ReponsesQuestions;
import projet.core.entity.ReponsesUtilisateurs;
import projet.core.service.QuestionService;
import projet.core.service.ReponsesQuestionsService;
import projet.core.service.ReponsesUtilisateursService;

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
public class QuestionController implements RestController{

    @Inject
    private QuestionService questionService;

    @Inject
    private ReponsesQuestionsService reponsesQuestionsService;

    @Inject
    private ReponsesUtilisateursService reponsesUtilisateursService;

    //liste de toutes les questions
    @GET
    @Path("/questions")
    public Map<Long,String> getQuestions(){
        List<Question> questions = questionService.findAll();
        Map<Long,String> returnedMap = new HashMap<>();
        for(Question question:questions){
            returnedMap.put(question.getId(),question.getIntitule());
        }
        return returnedMap;
    }

    //liste de toutes les questions appartenant a un quizz (et leurs reponses)
    @GET
    @Path("/questions/{quizz_id}")
    public Map<String,List<ReponsesQuestions>> getQuestionsWithQuizzId(@PathParam("quizz_id") long quizzId){
        List<Question> questions = questionService.findAllQuestionsFromQuizz(quizzId);
        int numberQuestions = questions.size();
        List<Long> idQuestions = new ArrayList<>();
        for (int i=0;i<numberQuestions;i++){
            idQuestions.add(questions.get(i).getId());
        }
        List<List<ReponsesQuestions>> reponses =new ArrayList();
        for (long id:idQuestions){
            List<ReponsesQuestions> reponsesQuestions = reponsesQuestionsService.findAllReponsesFromQuestionId((long) id);
            reponses.add(reponsesQuestions);
        }
        Map<String,List<ReponsesQuestions>> returnedMap = new HashMap<>();
        for(int j=0;j<numberQuestions;j++){
            returnedMap.put(questions.get(j).getIntitule(),reponses.get(j));
        }
        return returnedMap;
    }

    //intitule de la question en fonction de son id
    @GET
    @Path("/question/{question_id}")
    public Map<Long,String> getQuestionWithQuestionId(@PathParam("question_id") long questionId){
        Question question = questionService.getQuestionById(questionId);
        Map<Long,String> returnedMap = new HashMap<>();
        returnedMap.put(question.getId(),question.getIntitule());
        return returnedMap;
    }

    //intitule des reponses d'une question
    @GET
    @Path("/reponses/{question_id}")
    public Map<Long,String> getReponsesWithQuestionId(@PathParam("question_id") long questionId){
        List<ReponsesQuestions> reponsesQuestions = reponsesQuestionsService.findAllReponsesFromQuestionId(questionId);
        Map<Long,String> returnedMap = new HashMap<>();
        for(ReponsesQuestions reponsesQuestions1:reponsesQuestions){
            returnedMap.put(reponsesQuestions1.getId(),reponsesQuestions1.getReponse());
        }
        return returnedMap;
    }

    @POST
    @Path("/reponsesUtilisateurs")
    public void saveReponse(long reponse){
        reponsesUtilisateursService.saveReponseUtilisateur(reponse);

    }

    @DELETE
    @Path("/deleteReponses")
    public void deleteReponse(){
        reponsesUtilisateursService.deleteAll();

    }

}
