public boolean isValidSudoku(char[][] board) {
    HashSet<String> seen = new HashSet<>();
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            char currentVal = board[i][j];
            if (currentVal != '.') {
                if (!seen.add(currentVal + " found at row " + i) ||
                        !seen.add(currentVal + " found at col " + j) ||
                        !seen.add(currentVal + " found in box " + i / 3 + "and" + j / 3)) {
                    return false;
                }
            }
        }
    }
    return true;
}