package cards;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class JeuDeCartes {

    private List<Carte> cardsList;
    public JeuDeCartes(int size){
        this.cardsList = new ArrayList<>(size);
        if(size == 32) {
            for (int k = 0; k < 4; k++) {
                for (int l = 1; l <= 8; l++) {
                    this.cardsList.add(new Carte(l, k));
                }
            }
        }else if(size == 54){
            //52 cartes
            for(int k = 0; k < 4; k++){
                for(int l = 1; l <= 13; l++)
                    this.cardsList.add(new Carte(l, k));
            }
            //+2 jokers
            this.cardsList.add(new Carte(14,0));
            this.cardsList.add(new Carte(14, 2));
        }
    }
    public JeuDeCartes(){
        this(32);
    }
    public void melanger(){
        Collections.shuffle(cardsList);
    }
    public void trierParCouleur(){
        cardsList.sort(new ColorComparator());
    }
    public void trierParValeur(){
        cardsList.sort(new ValueComparator());
    }
    public Carte tirerAuHasard(){
        Random rand = new Random();
        int indiceCarte = rand.nextInt(32);
        Carte card = cardsList.get(indiceCarte);
        cardsList.remove(indiceCarte);
        return card;
    }
    public int getValeur(){
        int ret=0;
        for(Carte c : this.cardsList){
            ret += c.getValeur();
        }
        return ret;
    }
    public int getNbreCartes(){
        return cardsList.size();
    }

    public Carte getCarteAt(int idx){
        return cardsList.get(idx);
    }

    public List<Carte> getCardsList() {
        return cardsList;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("deck{\n");
        for(Carte card : this.cardsList){
            res.append("\t").append(card.toString()).append(" ,\n");
        }
        res.append("}\n");
        return res.toString();
    }

}
