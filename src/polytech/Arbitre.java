package polytech;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Arbitre {
    private List<Joueur> joueursList = new ArrayList<>();

    public int nbJoueur() {
        return joueursList.size();
    }

    public Joueur defineWinner() {
        for (Joueur joueur : joueursList) {
            joueur.play().getValeur();
        }
        return null;


    }


    public int NbPaquet() {
        if (nbJoueur() % 2 == 0) {
            return 32 / nbJoueur();

        }
        return 0;

    }
}
