public abstract class Board {
    protected int n;
    protected int n_moves = 0;
    protected char[][] board;
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
