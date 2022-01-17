package cards;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireCommandes {

    private final List<Command> cExecutedCommands = new ArrayList<>();
    private final List<Command> cUndoneCommands = new ArrayList<>();

    public void consume(Command pCommand) {
        pCommand.execute();
        cExecutedCommands.add(pCommand);
    }

    public void undoLast() {
        assert !cExecutedCommands.isEmpty();
        Command command = cExecutedCommands.remove(cExecutedCommands.size()-1);
        command.undo();
        cUndoneCommands.add(command);
    }

    public void redoLast() {
        assert !cUndoneCommands.isEmpty();
        Command command = cUndoneCommands.remove(cUndoneCommands.size()-1);
        consume(command);
        cExecutedCommands.add(command);
    }

    @Override
    public String toString() {
        return "cards.GestionnaireCommandes{" +
                "cExecutedCommands=" + cExecutedCommands +
                ", \n\t\tcUndoneCommands=" + cUndoneCommands +
                '}';
    }

    public List<Command> getcExecutedCommands() {
        return cExecutedCommands;
    }

    public List<Command> getcUndoneCommands() {
        return cUndoneCommands;
    }
}
