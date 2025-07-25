public class Administrateur extends Personnel{

    // Attributs
    private String service;
    private double salaire;

    // Constructeur
    public Administrateur(String nom, String prenom, int age, String matricule, double salaire_de_base, String service){
        super(nom, prenom, age, matricule, salaire_de_base);
        this.service = service;
    }

    // Methode afficher les contrat
    public String afficherContrat() {
        
        return super.toString()+" "+service;
    }


    // Methode pour calculer le salaire
    @Override
    public double calculerSalaire(){
        return salaire = getSalaire_de_base() + 500;
    }                 

    public String toFichierFormat(){
        return super.toString()+" "+service;
    }

    public static Administrateur fromFichierFormat(String ligne){
        String[] medecin = ligne.split(" ");
        String nom = medecin[0];
        String prenom = medecin[1];
        int age = Integer.parseInt(medecin[2]);
        String matricule = medecin[3];
        double salaire_de_base = Double.parseDouble(medecin[4]);
        String service = medecin[5];
        return new Administrateur(nom, prenom, age, matricule, salaire_de_base, service);
    }

}
