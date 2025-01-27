package package1;
import java.util.List;

public class Client {
    private String numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String phone;
    private String email;
    private List<Compte> comptes; // Liste des comptes

    // Constructeur
    public Client(String numClient, String nom, String prenom, String adresse, String phone, String email, List<Compte> comptes) {
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
        this.comptes = comptes;
    }

    // Getters et Setters
    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
    public String toJson() {
       

        return "{"
            + "\"numClient\":\"" + this.numClient + "\","
            + "\"nom\":\"" + this.nom + "\","
            + "\"prenom\":\"" + this.prenom + "\","
            + "\"adresse\":\"" + this.adresse + "\","
            + "\"phone\":\"" + this.phone + "\","
            + "\"email\":\"" + this.email + "\","
            + "}";
    }
}
