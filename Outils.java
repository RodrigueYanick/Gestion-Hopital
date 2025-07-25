import java.lang.reflect.Constructor;

public class Outils {

    public static <T> T outils(String line, Class<T> classe) throws Exception {
        String[] champ = line.split(" ");
        Constructor<T> constructor = classe.getConstructor(String[].class);
        return constructor.newInstance((Object)champ);
    }

}
