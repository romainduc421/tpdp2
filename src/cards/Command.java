package cards;

public interface Command {
    void execute();
    void undo();
    boolean validateShuffle();
    boolean validateSortColor();
    boolean validateDrawACard();
}
