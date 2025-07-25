import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // arrayList de patient
        ArrayList<Patient> patients = new ArrayList<>();
        // arrayList de personnel/medecin/infirmier/administrateur
        ArrayList<Personnel> personnels = new ArrayList<>();
        // objet de patient
        Patient patient1 = new Patient("Pemboura", "Inona", 19, "cardio237", "pauvrete");
        // Objet de personnel
        Personnel personnel1 = new Medecin("Penda", "Paul", 19, "23s3630", 10000000, "Coeur");
        // Objet d'hopital
        Hopital hopital = new Hopital(patients, personnels);
        // Sauvegarder un patient et medecin
        // hopital.sauvergarderMedecin();
        // hopital.sauvergarderPatient();
        // Ajout d'un nouveau personnel/medecin/infirmier/administrateur
        hopital.ajouterPersonnel(personnel1);
        // Ajout d'un nouveau patient
        hopital.ajouterPatient(patient1);
        // Objet de medecin
        Medecin medecin_1 = new Medecin("Meli", "Eric", 24, "22s2200", 500000, "ORL");

        // assigner un patient a un medecin retourne true pour assigner et false pour non
        // System.out.println(hopital.assignerMedecin(patient1, medecin_1));

    }
}
