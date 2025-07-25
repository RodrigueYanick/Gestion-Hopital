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


}
