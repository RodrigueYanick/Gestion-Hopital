public class Patient extends Personne{

    // Atributs
    private String numeroDossier;
    private String maladie;

    // Constructeur
    public Patient(String nom, String prenom, int age, String numeroDossier, String maladie){
        super(nom, prenom, age);
        this.numeroDossier = numeroDossier;
        this.maladie = maladie;
    }

    // methode afficherInfo
    
    public String afficherInfos(){
        return super.toString() + " " + numeroDossier + " " + maladie;
    }
    public String toString(){
        return super.toString() + " " + numeroDossier + " " + maladie;
    }

    // Getter Maladie
    public String getNumeroDossier(){
        return numeroDossier;
    }
    public String getMaladie(){
        return maladie;
    }


}
