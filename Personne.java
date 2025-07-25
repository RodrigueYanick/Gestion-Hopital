public class Personne {
    
    // Attributs
    private String nom;
    private String prenom;
    private int age;

    // Constructeur
    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Methode toStrig
    public String toString(){
        return nom + " " + prenom + " " + age + " ans ";
    }

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public double getAge(){
        return age;
    }
}
