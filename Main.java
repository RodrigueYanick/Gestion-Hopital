import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // arrayList de patient
        ArrayList<Patient> patients = new ArrayList<>();
        // arrayList de personnel/medecin/infirmier/administrateur
        ArrayList<Personnel> personnels = new ArrayList<>();
        // objet de patient
        Patient patient1 = new Patient("Mbeumo", "Ivan", 19, "cardio2371", "respiration");
        Patient patient2 = new Patient("Tchenche", "rochinelle", 20, "cardio2372", "coeur fragile");
        Patient patient3 = new Patient("poumo", "boys", 41, "Cancer2373", "Cancer du sein");
        Patient patient4 = new Patient("Bengono", "parvel", 35, "Maternite2374", "Colle ferme");
        Patient patient5 = new Patient("Ekambi", "cassandra", 28, "Cancer2375", "cancer du cerveau");
        // Objet de personnel
        Personnel personnel1 = new Medecin("Fokou", "Paul", 19, "Cardio3630", 10000000, "Coeur");
        Personnel personnel2 = new Medecin("Lahpa", "Pauline", 19, "Cardio3631", 18000000, "Coeur");
        Personnel personnel3 = new Medecin("Pemboura", "Inona", 19, "Cancer3632", 50300000, "Cancer");
        Personnel personnel4 = new Medecin("Mbami", "Divine", 19, "Maternite3633", 25000000, "Maternite");
        Personnel personnel5 = new Medecin("Boungie", "Fred", 19, "Cancer3634", 5000000, "Cancer");
        // instance de gestionnaireFichier
        GestionnaireDeFichier gestion = new GestionnaireDeFichier();
        // Ajjout de patient et personnel
        gestion.sauvegarde(patient1);
        gestion.sauvegarde(patient2);
        gestion.sauvegarde(patient3);
        gestion.sauvegarde(patient4);
        gestion.sauvegarde(patient5);
        gestion.sauvegarde(personnel1);
        gestion.sauvegarde(personnel2);
        gestion.sauvegarde(personnel3);
        gestion.sauvegarde(personnel4);
        gestion.sauvegarde(personnel5);

        // Affiche fichier
        gestion.AfficherFichier();
    
        // suppresion d'un personnel dans un fichier
        gestion.supprimerFichier(personnel1.getMatricule());

        // recherche un personnel dans un fichier
        gestion.rechercherFichier(personnel5.getMatricule());

        // suppresion d'un patient dans un fichier
        gestion.supprimerFichier(patient1.getNumeroDossier());

        // recherche un patient dans un fichier
        gestion.rechercherFichier(patient5.getNumeroDossier());

        // update d'un patient dans un fichier
        gestion.updateFichier(patient2.getNumeroDossier(), patient3);

        // update d'un personnel dans un fichier
        gestion.updateFichier(personnel2.getMatricule(), personnel3);

        // Objet d'hopital
        Hopital hopital = new Hopital(patients, personnels);
        hopital.ajouterPersonnel(personnel1);
        // Ajout d'un nouveau patient
        hopital.ajouterPatient(patient1);
        // hopital.assignerMedecin(patient4.getNumeroDossier(), personnel4.getMatricule());

        hopital.afficherTout();
        personnel3.calculerSalaire();
        personnel1.afficherContrat();
        personnel4.calculerSalaire();
        if(personnel2 instanceof Medecin){
            ((Medecin)personnel2).assignerPatient(patient5);
        }


    }
}
