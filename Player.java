import java.util.*;
public class Player {
    Scanner sc= new Scanner(System.in);
    protected String name;
    protected char symbol;
    protected int x, y;
    public Player(String name, char symbol){
        System.out.println("Welcome player: " + name);
        this.symbol = symbol;
        this.name = name;
    }
    public void getMove(){
        System.out.println("Enter your position in rows and columns (1:3) separated by spaces: " );
        x = sc.nextInt();
        y = sc.nextInt();
    }
    public char getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
