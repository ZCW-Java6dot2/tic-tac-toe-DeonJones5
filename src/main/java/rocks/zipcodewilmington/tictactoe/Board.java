package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }
   // Scanner scan = new Scanner(System.in);

    public Boolean columnWinnerFinder(Character anyLetter){
        if (anyLetter == matrix[0][0] && anyLetter == matrix[1][0] && anyLetter == matrix[2][0]){
            return true;
        } else if (anyLetter == matrix[0][1] && anyLetter == matrix[1][1] && anyLetter == matrix[2][1]){
            return true;
        } else if (anyLetter == matrix[0][2] && anyLetter == matrix[1][2] && anyLetter == matrix[2][2]){
            return true;
        }
        return false;

    }
    public Boolean rowWinnerFinder(Character anyLetter){
        if (anyLetter == matrix[0][0] && anyLetter == matrix[0][1] && anyLetter == matrix[0][2]){
            return true;
        } else if (anyLetter == matrix[1][0] && anyLetter == matrix[1][1] && anyLetter == matrix[1][2]){
            return true;
        } else if (anyLetter == matrix[2][0] && anyLetter == matrix[2][1] && anyLetter == matrix[2][2]){
            return true;
        }
        return false;


    }

    public Boolean diagonalWinnerFinder(Character anyLetter){
        if (anyLetter == matrix[0][0] && anyLetter == matrix[1][1] && anyLetter == matrix[2][2]){
            return true;
        } else if (anyLetter == matrix[2][0] && anyLetter == matrix[1][1] && anyLetter == matrix[0][2]){
            return true;
        }
        return false;


    }
    //if X is in 0,0 0,1 0,2 X is the winner

    public Boolean isInFavorOfX() {

        return columnWinnerFinder('X') || diagonalWinnerFinder('X') || rowWinnerFinder('X');
    }

    public Boolean isInFavorOfO() {

        return columnWinnerFinder('O') || diagonalWinnerFinder('O') || rowWinnerFinder('O');
    }

    public Boolean isTie() {
        if (columnWinnerFinder('X') || diagonalWinnerFinder('X') || rowWinnerFinder('X')){
            return false;
        } else if (columnWinnerFinder('O') || diagonalWinnerFinder('O') || rowWinnerFinder('O')){
            return false;
        }

        return true;

    }

    public String getWinner() {
        String winner = "";

        if (isInFavorOfX().equals(true) && isInFavorOfO().equals(false)){
            winner = "X";
        } else if (isInFavorOfX().equals(false) && isInFavorOfO().equals(true)){
            winner = "O";
        }
        return winner;


    }

}
