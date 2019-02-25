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
}
