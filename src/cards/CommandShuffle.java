package cards;

public class CommandShuffle implements Command{

    private JeuDeCartes deck;

    public CommandShuffle(JeuDeCartes pdc){
        this.deck = pdc;
    }
    @Override
    public void execute() {
        deck.melanger();
    }

    @Override
    public void undo() {
        deck = new JeuDeCartes();
    }

    @Override
    public boolean validateShuffle() {
        return true;
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
        return "melange_deck";
    }


}
