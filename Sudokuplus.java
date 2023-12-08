public class Sudokuplus {

    private static final int SIZE = 9;
    private static final int EMPTY = 0;

    public static void main(String[] args) {
        int[][] sudoku = {
                {0, 4, 5, 0, 2, 0, 1, 7, 0},
                {7, 2, 6, 0, 5, 0, 9, 0, 3},
                {0, 9, 1, 0, 7, 3, 6, 0, 2},

                {4, 0, 9, 0, 0, 5, 2, 0, 0},
                {1, 0, 0, 7, 0, 0, 0, 9, 0},
                {5, 0, 8, 2, 1, 0, 4, 0, 0},
                
                {9, 1, 0, 0, 0, 8, 0, 0, 4},
                {0, 8, 0, 0, 4, 2, 5, 0, 0},
                {2, 0, 4, 0, 9, 7, 3, 0, 0}
        };

        if (solveSudoku(sudoku)) {
            System.out.println("Sudoku Plus:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution found for the Sudoku.");
        }
    }

    private static boolean solveSudoku(int[][] sudoku) {
        int[][][] possibleValues = new int[SIZE][SIZE][SIZE + 1];
        initializePossibleValues(sudoku, possibleValues);

        return solve(sudoku, possibleValues);
    }

    private static boolean solve(int[][] sudoku, int[][][] possibleValues) {
        int[] nextCell = findNextEmptyCell(sudoku);
        if (nextCell == null) {
            return true; // All cells filled, Sudoku solved
        }

        int row = nextCell[0];
        int col = nextCell[1];

        for (int num = 1; num <= SIZE; num++) {
            if (isSafe(sudoku, row, col, num)) {
                sudoku[row][col] = num;
                if (solve(sudoku, possibleValues)) {
                    return true;
                }
                sudoku[row][col] = EMPTY; // Backtrack
            }
        }

        return false;
    }

    private static int[] findNextEmptyCell(int[][] sudoku) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (sudoku[row][col] == EMPTY) {
                    return new int[]{row, col};
                }
            }
        }
        return null; // All cells filled
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int num) {
        return !usedInRow(sudoku, row, num) &&
                !usedInColumn(sudoku, col, num) &&
                !usedInBox(sudoku, row - row % 3, col - col % 3, num);
    }

    private static boolean usedInRow(int[][] sudoku, int row, int num) {
        for (int col = 0; col < SIZE; col++) {
            if (sudoku[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean usedInColumn(int[][] sudoku, int col, int num) {
        for (int row = 0; row < SIZE; row++) {
            if (sudoku[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean usedInBox(int[][] sudoku, int boxStartRow, int boxStartCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (sudoku[row + boxStartRow][col + boxStartCol] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void initializePossibleValues(int[][] sudoku, int[][][] possibleValues) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (sudoku[row][col] != EMPTY) {
                    for (int num = 1; num <= SIZE; num++) {
                        possibleValues[row][col][num] = 0;
                    }
                } else {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isSafe(sudoku, row, col, num)) {
                            possibleValues[row][col][num] = num;
                        } else {
                            possibleValues[row][col][num] = 0;
                        }
                    }
                }
            }
        }
    }

    private static void printSudoku(int[][] sudoku) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(sudoku[row][col] + " ");
            }
            System.out.println();
        }
    }
}
