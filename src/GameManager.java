import java.util.*;

public class GameManager {
    Scanner sc= new Scanner(System.in);
    private Player players[] = new Player[2];
    public void run(){
        XoBoard board = new XoBoard();
        int choice;
        char ch1, ch2;
        System.out.println("Welcome to X-O Game: \n 1.Multiplayer. \n 2.Exit.");
        choice = sc.nextInt();
        if(choice == 1){
            board.display_board();
            System.out.println("Please choose your symbol (x,o): ");
            ch1 = sc.next().charAt(0);
            if(ch1 == 'x')
                ch2 = 'o';
            else
                ch2 = 'x';
            String name1, name2;
            System.out.println("Please enter name of player 1: ");
            name1 = sc.next();
            System.out.println("Please enter name of player 2: ");
            name2 = sc.next();
            players[0] = new Player(name1, ch1);
            players[1] = new Player(name2, ch2);
            while(true) {
                for (int i = 0; i < 2; ++i) {
                    players[i].getMove();
                    while (!board.update_board(players[i].getX(), players[i].getY(), players[i].getSymbol())){
                        System.out.println("Can't add in this position, please try again: ");
                        players[i].getMove();
                    }
                    board.display_board();
                    System.out.println();
                    if (board.is_winner()) {
                        System.out.println(players[i].getName() + " wins! ");
                        return;
                    }

                    if (board.is_draw()) {
                        System.out.println( "Game ends, Tie! ");
                        return;
                    }
                }
            }
        } else {
            System.out.println("Thank You for using X-O Game!");
        }
    }
}
