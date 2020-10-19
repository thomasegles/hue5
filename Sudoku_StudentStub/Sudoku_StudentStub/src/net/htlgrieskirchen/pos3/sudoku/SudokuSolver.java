package net.htlgrieskirchen.pos3.sudoku;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Please enter here an answer to task four between the tags:
 * <answerTask4>
 *    Hier sollte die Antwort auf die Aufgabe 4 stehen.
 * </answerTask4>
 */
public class SudokuSolver implements ISodukoSolver {

    public SudokuSolver() {
        //initialize if necessary
    }

    @Override
    public final int[][] readSudoku(File file) {
        int[][] arr = new int[9][9];
        try {
            arr = Files.lines(file.toPath())
                    .map(s -> s.split(";"))
                    .map(a -> new int[]{Integer.parseInt(a[0]),
                Integer.parseInt(a[1]),
                Integer.parseInt(a[2]),
                Integer.parseInt(a[3]),
                Integer.parseInt(a[4]),
                Integer.parseInt(a[5]),
                Integer.parseInt(a[6]),
                Integer.parseInt(a[7]),
                Integer.parseInt(a[8])})
                    .toArray(int[][]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public boolean checkSudoku(int[][] rawSudoku) {
        int row = 0;
        int col = 0;
        int rowVal = 0;
        int colVal = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = rowVal; j < row; j++) {
                for (int k = colVal; k < col; k++) {
                    //code
                }
                col = 0;
                row++;
            }
        }
        return false; // delete this line!
    }

    @Override
    public int[][] solveSudoku(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }

    @Override
    public int[][] solveSudokuParallel(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }

    // add helper methods here if necessary
}
