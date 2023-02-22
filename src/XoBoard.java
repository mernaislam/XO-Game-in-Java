public class XoBoard extends Board{
    public XoBoard(){
        super(3);
    }

    @Override
    public boolean is_draw() {
        return (n_moves == 9 && !is_winner());
    }

    @Override
    public boolean is_winner() {
        for(int i = 0; i < 3; i++){
            char symbol = board[i][0];
            if(board[i][1] == symbol && board[i][2] == symbol && symbol != 0){
                return true;
            }
        }
        for(int i = 0; i < 3; i++){
            char symbol = board[0][i];
            if(board[1][i] == symbol && board[2][i] == symbol && symbol != 0){
                return true;
            }
        }
        char symbol = board[0][0];
        if(board[1][1] == symbol && board[2][2] == symbol && symbol != 0){
            return true;
        }
        symbol = board[0][2];
        if(board[1][1] == symbol && board[2][0] == symbol && symbol != 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update_board(int x, int y, char symbol) {
        if (!(x < 0 || x > 2 || y < 0 || y > 2) && (board[x][y] == 0)) {
            board[x][y] = symbol;
            n_moves++;
            return true;
        }
        else
            return false;
    }
}
