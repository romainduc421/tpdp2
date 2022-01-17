package cards;

public class CommandDrawACard implements Command{
    private JeuDeCartes deck;
    private Carte drawCard;

    public CommandDrawACard(JeuDeCartes pdc){
        this.deck = pdc;
    }
    @Override
    public void execute() {
        this.drawCard = deck.tirerAuHasard();
        System.out.println("carte_piochee = "+this.drawCard);
    }

    @Override
    public void undo() {
        deck.getCardsList().add(this.drawCard);
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
        return true;
    }

    public JeuDeCartes getdeck() {
        return deck;
    }

    @Override
    public String toString(){
        return "tirer_une_carte_auHasard";
    }


}
