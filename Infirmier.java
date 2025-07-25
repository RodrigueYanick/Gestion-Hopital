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
    @Override
    public double calculerSalaire(){
        double salaire;
        return salaire = getSalaire_de_base() + 500;
    }     
    
    public String getService(){
        return service;
    }


}
