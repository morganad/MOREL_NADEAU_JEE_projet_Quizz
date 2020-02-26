package projet.web.controller;

import projet.core.entity.Utilisateur;
import projet.core.service.UtilisateurService;

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
public class UtilisateurController implements RestController {

    @Inject
    private UtilisateurService utilisateurService;

    @GET
    @Path("/utilisateurs")
    public Map<Long,String> getUtilisateurs(){
        List<Utilisateur> utilisateurs = utilisateurService.findAll();
        Map<Long,String> returnedMap = new HashMap<>();
        for(Utilisateur utilisateur:utilisateurs){
            returnedMap.put(utilisateur.getId(),utilisateur.getPrenom());
        }
        for (Utilisateur utilisateur:utilisateurs) {
            System.out.println(utilisateur);
        }

        return returnedMap;
    }
}
