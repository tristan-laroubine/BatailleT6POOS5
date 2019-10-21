package polytech;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Class : Deck représenter un tas de cartes qui varie en fonction du nombre de joueurs
 * @Date 21/10/2019
 * @author Tristan LAROUBINE
 * @version 1.0
 */
public class Deck implements IPacketable {
    private List<Carte> cartes = new ArrayList<>();

    /**
     * Construction d'un Deck
     */
    Deck() {
        for (String color : BatailleMagicNumber.couleurs) {
            for (int i = 0; i < BatailleMagicNumber.NOMBRE_DE_CARTE_PAR_COULEUR; i++) {
                try {
                    if (i != 5) {
                        cartes.add(new Carte(Integer.toString(i), color));
                    } else {
                        cartes.add(new Carte(BatailleMagicNumber.REPRESENTATION_AS, color));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Deck contenant 32 cartes * nombreDeJeux
     * @param nombreDeJeux Nombre de jeux dans le deck
     */
    Deck(int nombreDeJeux) {
        for (int i = 0; i < nombreDeJeux; i++) {
            cartes.addAll(new Deck().getCartes());
        }
    }

    /**
     * Mélange le deck
     * @param nombreDeMelange nombre de mélange à effectuer
     * @return
     */
    public List<Carte> shuffle(int nombreDeMelange) {

        for (int i = 0; i < nombreDeMelange; i++) {
            for (int j = 0; j < cartes.size(); j++) {
                swap(j, (int) (Math.random() * cartes.size()));
            }
        }
        return this.cartes;
    }

    private void swap(int indexA, int indexB) {
        swap(cartes.get(indexA), cartes.get(indexB));

    }

    private void swap(Carte carteA, Carte carteB) {
        Carte intermediaire = carteA;
        carteA = carteB;
        carteB = intermediaire;
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    /**
     * Fusionne deux deck
     * @param deck le deck à fussionner
     */
    private void addAll(Deck deck) {
        this.cartes.addAll(deck.getCartes());
    }

    /**
     * Donne une carte et l'enlève du deck
     * @return une carte
     */
    public Carte giveCarte(){
        return cartes.remove(0);
    }


}
