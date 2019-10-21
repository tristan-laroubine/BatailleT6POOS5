package polytech;

import java.util.List;

/**
 * Interface IPacketable : doit pouvoir être mélanger "shuffle" et donner une carte "giveCarte"
 * @Date 21/10/2019
 * @author Tristan LAROUBINE
 * @version 1.0
 */
public interface IPacketable {
    public List<Carte> shuffle(int nombreDeMelange);

    public Carte giveCarte();
}
