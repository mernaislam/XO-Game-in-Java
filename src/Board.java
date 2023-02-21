public abstract class Board {
    protected int n;
    protected int n_moves = 0;
    protected char board[][];  // char board[][] = new char[3][3];
    public Board(int num){
        n = num;
        board = new char[n][n];
    }
    public abstract boolean update_board(int x, int y, char symbol);
    public abstract boolean is_winner();
    public abstract boolean is_draw();
    public void display_board(){
        for (int i = 0; i < n; i++){
            System.out.print("  " + (i+1) + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0){
                    System.out.print((i+1) + " ");
                }
                if(board[i][j] == 0){
                    System.out.print('_' + " | ");
                }else{
                    System.out.print(board[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }
}

// abstract class : class that have at least one pure virtual function

// funtion player virtual getMove() ==> welcome ...
// computerPlayer getMove() ==> find best move ...
// main ==>
// Player p1;
// computerPlayer pc;
// p1.getMove();
// pc.getMove();

// Board virtual is_Winner() = 0;  ==> abstract is_winner();
// XOboard is_Winner() { digaonal ... };
// Connect4Board is_Winner() { };

