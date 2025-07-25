public class Infirmier extends Personnel{

    // Attributs
    private String service;
    
    // Constructeur
    public Infirmier(String nom, String prenom, int age, String matricule, double salaire_de_base, String service){
        super(nom, prenom, age, matricule, salaire_de_base);
        this.service = service;
    }
    
    // Methode Afficher les contart
    public String afficherContrat() {
        return super.toString()+" "+service;
    }
    
    // Methode calculer les salaire
    double salaire;
    @Override
    public double calculerSalaire(){
        return salaire = getSalaire_de_base() + 500;
    }     
    
    public String getService(){
        return service;
    }

    public String toFichierFormat(){
        return super.toString()+" "+service;
    }

    public static Infirmier fromFichierFormat(String ligne){
        String[] medecin = ligne.split(" ");
        String nom = medecin[0];
        String prenom = medecin[1];
        int age = Integer.parseInt(medecin[2]);
        String matricule = medecin[3];
        double salaire_de_base = Double.parseDouble(medecin[4]);
        String service = medecin[5];
        return new Infirmier(nom, prenom, age, matricule, salaire_de_base, service);
    }

}
