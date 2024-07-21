package Matrix;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        // int[][] ans= new int[m][n];
        int directions[][] = new int[][] { { -1, -1, }, { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, 0 }, { 0, -1 }, { 0, 1 },
                { 1, 0 } };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tempAns = 0;
                for (int direction[] : directions) {
                    int X = i + direction[0];
                    int Y = j + direction[1];

                    if (X >= 0 && X < m && Y >= 0 && Y < n && (board[X][Y] == 1 || board[X][Y] == 2)) {
                        tempAns++;
                    }
                }

                // alive->dead
                if (board[i][j] == 1) {
                    if (tempAns < 2 || tempAns > 3) {
                        board[i][j] = 2;
                    }
                }
                // dead-> alive
                else {
                    if (tempAns == 3) {
                        board[i][j] = 3;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // died
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
                // jeeweet again
                else if (board[i][j] == 3) {
                    board[i][j] = 1;
                }
            }
            // or use %2
        }
    }
}