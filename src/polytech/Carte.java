package polytech;

import java.util.List;

public class Carte {
    private int valeur;
    private String couleur;

    public Carte(int valeur, String couleur) throws Exception {
        this.valeur = valeur;
        this.couleur = couleur;
        if (valeur < 0 || valeur > 10)
            throw new Exception("Valeur de la carte, trop elevé");

        if (!BatailleMagicNumber.containsColor(couleur)){
            throw new Exception("Couleur invalide");
        }
    }

    public int getValeur() {
        return valeur;
    }


    public String getCouleur() {
        return couleur;
    }

}
