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
    @Override
    public double calculerSalaire(){
        double salaire = 0;
        return salaire = getSalaire_de_base() + (1000 * patientAffecter());
    }

    // methode gettter specialite
    public String getSpecialite(){
        return specialite;
    }


}
