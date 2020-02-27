package projet.web.controller;

import projet.core.entity.Question;
import projet.core.service.QuestionService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
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

    @GET
    @Path("/questions/{quizz_id}")
    public Map<Long,String> getQuestionsWithQuizzId(@PathParam("quizz_id") long quizzId){
        //List<Question> questions = questionService.findAll();
        List<Question> questions = questionService.findAllQuestionsFromQuizz(quizzId);
        Map<Long,String> returnedMap = new HashMap<>();
        for(Question question:questions){
            returnedMap.put(question.getId(),question.getIntitule());
        }
        return returnedMap;
    }

}
