
import java.util.ArrayList;


public class Hopital {

    // Attributs 
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Personnel> personnels = new ArrayList<>();
    // Constructeur
    public Hopital(ArrayList<Patient> patients, ArrayList<Personnel> personnels){
        this.patients = patients;
        this.personnels = personnels;
    }

    // methode pour ajouter un patient
    public void ajouterPatient(Patient patient){
        patients.add(patient);
    }

    // methode pour ajouter un personnel
    public void ajouterPersonnel(Personnel personnel){
        personnels.add(personnel);
    }
    
    // medecin assigne
    public void assignerMedecin(String numeroDossierPatient, String matriculeMedecin){
        Medecin medecinTrouve = null;
        Patient patienttrouve = null;
        for(Patient patient : patients){
            if(patient.getNumeroDossier().equals(numeroDossierPatient)){
                patienttrouve = patient;
            }
        }
        for(Personnel perso : personnels){
            if(perso instanceof Medecin && perso.getMatricule().equals(matriculeMedecin)){
                medecinTrouve = (Medecin)perso;
                System.out.println();
            }
        }
        if(patienttrouve != null && medecinTrouve != null){
            medecinTrouve.assignerPatient(patienttrouve);
        }
    }
    
    public void afficherTout(){
        for(Patient patient2 : patients){
            System.out.println(patient2.afficherInfos());
        }
        
        for(Personnel personnel2 : personnels){
            System.out.println(personnel2.afficherContrat());
        }
    }
            
}
