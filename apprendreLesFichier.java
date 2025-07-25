import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class apprendreLesFichier {

    public static void main(String[] args) {
        
        File file = new File("nouveau fichier");
        try{
            if(file.createNewFile()){
                System.out.println("Le fichier a ete cree");
            }else{
                System.out.println("Le fichier existe deja");
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("ligne ajouter");
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}