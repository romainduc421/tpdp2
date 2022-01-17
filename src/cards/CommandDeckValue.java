package cards;

public class CommandDeckValue implements Command{

    private JeuDeCartes deck;

    public CommandDeckValue(JeuDeCartes pdc){
        this.deck = pdc;
    }
    @Override
    public void execute() {
        System.out.println("value_deck = "+deck.getValeur());
    }

    @Override
    public void undo() {
    }

    @Override
    public boolean validateShuffle() {
        return false;
    }

    @Override
    public boolean validateSortColor() {
        return false;
    }

    @Override
    public boolean validateDrawACard() {
        return false;
    }

    public JeuDeCartes getdeck() {
        return deck;
    }

    @Override
    public String toString(){
        return "valeur_totale_deck";
    }


}
