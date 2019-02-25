package cc.before30.algex.general;

public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {

        // find R
        int row_r = -1;
        int col_r = -1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    row_r = i;
                    col_r = j;
                }
            }
        }

        int result = 0;

        // check north
        for (int i = row_r; i >= 0; i--) {
            if (board[i][col_r] == 'p') {
                result = result + 1;
                break;
            } else if (board[i][col_r] == 'B') {
                break;
            }
        }

        // check south
        for (int i = row_r; i < 8; i++) {
            if (board[i][col_r] == 'p') {
                result = result + 1;
                break;
            } else if (board[i][col_r] == 'B') {
                break;
            }
        }

        // check east
        for (int j = col_r; j < 8; j++) {
            if (board[row_r][j] == 'p') {
                result = result + 1;
                break;
            } else if (board[row_r][j] == 'B') {
                break;
            }
        }

        // check west
        for (int j = col_r; j >= 0; j--) {
            if (board[row_r][j] == 'p') {
                result = result + 1;
                break;
            } else if (board[row_r][j] == 'B') {
                break;
            }
        }

        return result;
    }

    public int numRookCapture2(char[][] board) {
        int row_r = -1;
        int col_r = -1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    row_r = i;
                    col_r = j;
                }
            }
        }

        return numRookCaptures(board, row_r, col_r, 'N') +
                numRookCaptures(board, row_r, col_r, 'S') +
                numRookCaptures(board, row_r, col_r, 'E') +
                numRookCaptures(board, row_r, col_r, 'W');
    }
    public int numRookCaptures(char[][] board, int row, int col, char direction){
        if (row < 0 || col < 0 || row > 8 || col > 8) {
            return 0;
        }

        if (board[row][col] == 'p') return 1;
        else if (board[row][col] == 'B') return 0;

        switch (direction) {
            case 'N':
                return numRookCaptures(board, row-1, col, 'N');
            case 'S':
                return numRookCaptures(board, row+1, col, 'S');
            case 'E':
                return numRookCaptures(board, row, col+1, 'E');
            case 'W':
            default:
                return numRookCaptures(board, row, col-1, 'W');
        }
    }
}
