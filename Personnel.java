public abstract class Personnel extends Personne implements Employable{

    // Attributs
    private String matricule;
    private double salaire_de_base;

    // Contructeur
    public Personnel(String nom, String prenom, int age, String matricule, double salaire_de_base){
        super(nom, prenom, age);
        this.matricule = matricule;
        this.salaire_de_base = salaire_de_base;  
    }

    public String toString(){
        return super.toString()+" "+matricule+" "+salaire_de_base;
    }

    public String getMatricule(){
        return matricule;
    }

    public double getSalaire_de_base(){
        return salaire_de_base;
    }

    // methode abstrait
    public abstract double calculerSalaire();

}
