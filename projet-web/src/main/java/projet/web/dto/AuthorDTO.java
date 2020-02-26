package projet.web.dto;

public class AuthorDTO {

    private long id;

    private String prenom;

    private String nom;

    private long score_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getScore_id() {
        return score_id;
    }

    public void setScore_id(long score_id) {
        this.score_id = score_id;
    }
}
