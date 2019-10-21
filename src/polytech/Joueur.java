package polytech;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
        private String nom;
        private List<Carte> paquet =new ArrayList<>();



        public Joueur(String nom, Deck main){
            nom=nom;
            main=main;
        }

         public Carte play (){
            return paquet.get(0);
         }
    }
