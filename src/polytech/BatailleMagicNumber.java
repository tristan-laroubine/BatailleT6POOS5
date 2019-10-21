package polytech;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public abstract class BatailleMagicNumber {
    public static String COULEUR_COEUR = "Co";
    public static String COULEUR_PIQUE = "Pi";
    public static String COULEUR_CARREAU = "Ca";
    public static String COULEUR_TREFLE = "Tr";

    public static List<String> couleurs = new ArrayList<>(Arrays.asList(COULEUR_CARREAU,COULEUR_COEUR,COULEUR_PIQUE,COULEUR_TREFLE));
    public static int NOMBRE_DE_CARTE_PAR_COULEUR = 5;


    public static int VALUE_AS = 99;
    public static String REPRESENTATION_AS = "A";
    public static boolean containsColor(String color){
        return couleurs.contains(color);
    }

}
