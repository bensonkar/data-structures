package main;

/**
 * @author bkariuki
 */
public class TwoDArrays {
    static int[][] array = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            System.out.println();
            for (j = 0; j < array[i].length; j++) {
                System.out.println("2D array " + array[i][j]);
            }
        }
    }
}
