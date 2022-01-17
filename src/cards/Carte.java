package cards;

public class Carte {

    private int couleur;
    private int valeur;

    public Carte(){

    }
    public Carte(int val, int color){
        this.valeur = val;
        this.couleur = color;
    }
    public int getCouleur() {
        return couleur;
    }

    public int getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Card{" +
                "c=" + couleur +
                ", val=" + valeur +
                '}';
    }
}
