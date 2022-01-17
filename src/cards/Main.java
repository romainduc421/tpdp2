package cards;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        JeuDeCartes pdc = new JeuDeCartes(32);

        GestionnaireCommandes managerCommands = new GestionnaireCommandes();

        Scanner sc = new Scanner(System.in);
        System.out.println("What Would U like to do ?");

        int nb = 0;
        while(nb != 7) {
            Command c;
            System.out.println("1 : shuffle the cards \t2 : sort the cards by color");
            System.out.println("3 : draw a card randomly \t4 : know the total value of the deck");
            System.out.println("5 : know the number of cards \t6 : undo the last command");
            System.out.println("7 : exit");
            System.out.println("Saisissez un nombre : \t");
            nb = sc.nextInt();
            if (nb == 1) {
                c = new CommandShuffle(pdc);
                managerCommands.consume(c);
                System.out.println(((CommandShuffle)c).getdeck());
            } else if (nb == 2) {
                c = new CommandSortColor(pdc);
                managerCommands.consume(c);
                System.out.println(((CommandSortColor)c).getdeck());
            } else if (nb == 3) {
                c = new CommandDrawACard(pdc);
                managerCommands.consume(c);
                System.out.println(((CommandDrawACard)c).getdeck());
            } else if (nb == 4) {
                c = new CommandDeckValue(pdc);
                managerCommands.consume(c);
                System.out.println("pas de modif du deck");
            } else if (nb == 5) {
                c = new CommandNbCartes(pdc);
                managerCommands.consume(c);
                System.out.println("pas de modif du deck");
            } else if (nb == 6) {
                managerCommands.undoLast();
                Command cmd = managerCommands.getcUndoneCommands().get(managerCommands.getcUndoneCommands().size()-1);
                if(cmd.validateShuffle()){
                    System.out.println("undoShuffle");
                    System.out.println(((CommandShuffle)cmd).getdeck());
                }
                else if(cmd.validateSortColor()){
                    System.out.println("undoSortColor");
                    System.out.println(((CommandSortColor)cmd).getdeck());
                }
                else if(cmd.validateDrawACard()){
                    System.out.println("undoDrawCard");
                    System.out.println(((CommandDrawACard)cmd).getdeck());
                }
            }
        }
        System.out.println(managerCommands);
    }
}
