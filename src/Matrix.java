import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        System.out.println("Чётные числа:");
        int matrix[][] = {{2, 4, 6, 8, 10},
                {2, 6, 8, 10, 12},
                {12, 16, 18, 8, 10}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println("Нечётные числа:");
            int matrixx[][] = {{1, 5, 9, 11, 3},
                    {9, 9, 5, 31, 1},
                    {7, 5, 1, 1, 53}};
            for (int g = 0; g < matrixx.length; g++) {
                for (int d = 0; d < matrixx[g].length; d++) {
                    System.out.print(matrixx[g][d] + " ");
                }
                System.out.println();
            }
        }
    }
