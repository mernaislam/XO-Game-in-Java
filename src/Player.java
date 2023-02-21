import java.util.*;
public class Player {   // p1 -> name , symbol , x , y ==> getX, getY
    Scanner sc = new Scanner(System.in);
    private String name;
    private char symbol;
    private int x, y;
    public Player(String name, char symbol){
        // cout << .... ; ==== System.out.print("..." + variable);
        // cout << "kalam" << variable << .. << endl;
        System.out.println("Welcome player: " + name);  // cout << "welcome player: " << name << endl;
        this.symbol = symbol;
        this.name = name;
    }
    public void getMove(){
        System.out.println("Enter your position in rows and columns (1:3) separated by spaces: " );
        // cin >> x;
        // char ayhaga = sc.next().charAt(0);
        x = sc.nextInt();
        y = sc.nextInt();
        x--;
        y--;
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
