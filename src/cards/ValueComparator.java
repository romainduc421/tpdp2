package cards;

import java.util.Comparator;

public class ValueComparator implements Comparator<Carte> {

    @Override
    public int compare(Carte c1, Carte c2){
        return c1.getValeur() - c2.getValeur() ;
    }
}
