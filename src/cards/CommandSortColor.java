package cards;

public class CommandSortColor implements Command{

    private JeuDeCartes deck;

    public CommandSortColor(JeuDeCartes pdc){
        this.deck = pdc;
    }
    @Override
    public void execute() {
        deck.trierParCouleur();
    }

    @Override
    public void undo() {
        deck = new JeuDeCartes();
    }

    @Override
    public boolean validateShuffle() {
        return false;
    }

    @Override
    public boolean validateSortColor() {
        return true;
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
        return "tri_couleur";
    }


}
