package cards;

import java.util.Comparator;

public class ColorComparator implements Comparator<Carte> {

    @Override
    public int compare(Carte c1, Carte c2){
        return c1.getCouleur() - c2.getCouleur();
    }
}
