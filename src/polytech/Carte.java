package polytech;

import java.util.List;

/**
 * Class : Carte représente une carte d'un jeux de 32 cartes (pas d'un pokemon ...)
 * @Date 21/10/2019
 * @author Tristan LAROUBINE
 * @version 1.0
 */
public class Carte {
    private int valeur;
    private String couleur;

    public Carte(String valeur, String couleur) throws Exception {
        if (valeur.equals(BatailleMagicNumber.REPRESENTATION_AS))
        {
            this.valeur = BatailleMagicNumber.VALUE_AS;
        }
        try {
            this.valeur = Integer.parseInt(valeur);
        }catch (Exception e){
            throw new Exception("Valeur invalide");
        }

        this.couleur = couleur;
        if ((this.valeur < 7 || this.valeur > 10) && this.valeur != BatailleMagicNumber.VALUE_AS)
            throw new Exception("Valeur de la carte, trop elevé");

        if (!BatailleMagicNumber.containsColor(couleur)){
            throw new Exception("Couleur invalide");
        }
    }

    public int getValeur() {
        return valeur;
    }

    public String getValeurToString(){
        if (valeur == BatailleMagicNumber.VALUE_AS)
            return BatailleMagicNumber.REPRESENTATION_AS;
        return "" + valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return getValeurToString()+getCouleur();
    }
}
