import java.util.ArrayList;

public class Medecin extends Personnel {

    // Attribits
    private String specialite;
    private ArrayList<Patient> patientAssigner = new ArrayList<>();

    // Constructeur
    public Medecin( String nom, String prenom, int age, String matricule, double salaire_de_base, String specialite){
        super(nom, prenom, age, matricule, salaire_de_base);
        this.specialite = specialite;
    }

    // redefinition methode afficherContrat
    public String afficherContrat() {
        return super.toString()+" "+specialite;
    }
        
    // patient affecter
    public void assignerPatient(Patient p){
        patientAssigner.add(p);
    }

    public int patientAffecter(){
        return patientAssigner.size();
    }

    // methode calculer salaire
    double salaire = 0;
    @Override
    public double calculerSalaire(){
        return salaire = getSalaire_de_base() + (1000 * patientAffecter());
    }

    // methode gettter specialite
    public String getSpecialite(){
        return specialite;
    }

    public String toFichierFormat(){
        return super.toString()+" "+specialite;
    }

    public static Medecin fromFichierFormat(String ligne){
        String[] champMedecin = ligne.split(" ");
        String nom = champMedecin[0];
        String prenom = champMedecin[1];
        int age = Integer.parseInt(champMedecin[2]);
        String matricule = champMedecin[3];
        double salaire_de_base = Double.parseDouble(champMedecin[4]);
        String specialite = champMedecin[5];
        return new Medecin(nom, prenom, age, matricule, salaire_de_base, specialite);
    }

}
