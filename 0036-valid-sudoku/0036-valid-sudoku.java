class Solution {

    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int row = 0; row < 9; row++) {

            HashSet<Character> set = new HashSet<>();

            for (int col = 0; col < 9; col++) {

                char current = board[row][col];

                if (current == '.') continue;

                if (set.contains(current))
                    return false;

                set.add(current);
            }
        }

        // Check columns
        for (int col = 0; col < 9; col++) {

            HashSet<Character> set = new HashSet<>();

            for (int row = 0; row < 9; row++) {

                char current = board[row][col];

                if (current == '.') continue;

                if (set.contains(current))
                    return false;

                set.add(current);
            }
        }

        // Check 3x3 boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {

            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int row = boxRow; row < boxRow + 3; row++) {

                    for (int col = boxCol; col < boxCol + 3; col++) {

                        char current = board[row][col];

                        if (current == '.') continue;

                        if (set.contains(current))
                            return false;

                        set.add(current);
                    }
                }
            }
        }

        return true;
    }
}