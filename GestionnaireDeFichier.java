import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestionnaireDeFichier {

    
    public <T> void sauvegarde( T element){
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter("Hopital_File.txt", true))){
                buffer.write(element.toString());
                buffer.newLine();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    
    
    public void AfficherFichier(){
        String ligne;
        try(BufferedReader reader = new BufferedReader(new FileReader("Hopital_File.txt"))){
            while ((ligne = reader.readLine()) != null) {
                    System.out.println(ligne);
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("erreur lors de la lecture");
        }
    }


    public void rechercherFichier(String citere){
        String ligne;
        boolean trouve = false;
        try(BufferedReader reader = new BufferedReader(new FileReader("Hopital_File.txt"))){
            while ((ligne = reader.readLine()) != null) {
                if(ligne.contains(citere)){
                    System.out.println("trouver");
                    System.out.println(ligne);
                    trouve = true;
                    break;
                }
            }
            if(trouve == false){
                System.out.println("aucun element trouve");
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("erreur lors de la lecture");
        }
    }

    public void supprimerFichier(String critere){
        try (BufferedReader reader = new BufferedReader(new FileReader("Hopital_File.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Hopital_File.txt.tmp"))) {
            String ligne = null;
            while((ligne = reader.readLine()) != null){
                if(!(ligne.contains(critere))){
                    writer.write(ligne);
                }
                writer.newLine();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        File originalFile = new File("Hopital_File.txt");
        File temporalFile = new File("Hopital_File.txt.tmp");
        originalFile.delete();
        temporalFile.renameTo(originalFile);
    }

    public <T> void updateFichier(String critere, T newLine){
        try (BufferedReader reader = new BufferedReader(new FileReader("Hopital_File.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Hopital_File.txt.tmp"))) {
            String ligne = null;
            while ((ligne = reader.readLine()) != null) {
                if(ligne.contains(critere)){
                    writer.write(newLine.toString());
                    writer.newLine();
                }else{
                    writer.write(ligne);
                    writer.newLine();
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        File originalFile = new File("Hopital_File.txt");
        File temporFile = new File("Hopital_File.txt.tmp");
        originalFile.delete();
        temporFile.renameTo(originalFile);
    }
}
