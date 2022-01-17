package cards;

public class CommandNbCartes implements Command{
    private JeuDeCartes deck;

    public CommandNbCartes(JeuDeCartes pdc){
        this.deck = pdc;
    }
    @Override
    public void execute() {
        System.out.println("nb_cartesDeck = "+deck.getNbreCartes());
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
        return "nb_cartes_deck";
    }


}
