import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese el numero de filas de la primera matriz: ");
        int rows1 = sc.nextInt();

        System.out.print("Ingrese el numero de columnas de la primera matriz: ");
        int cols1 = sc.nextInt();

        System.out.print("Ingrese el numero de filas de la segunda matriz: ");
        int rows2 = sc.nextInt();

        System.out.print("Ingrese el numero de columnas de la segunda matriz: ");
        int cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("no se puede multiplicar");
            return;
        }

        int[][] A = new int[rows1][cols1];
        int[][] B = new int[rows2][cols2];
        int[][] C = new int[rows1][cols2];

        System.out.println("Ingrese los elementos de la primera matriz: ");
        fillMatrix(A);

        System.out.println("Ingresa los elementos de la segunda matriz: ");
        fillMatrix(B);

        int[][] matrix = solve(rows1, cols1, rows2, cols2, A, B, C);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static int[][] solve(int rows1, int cols1, int rows2, int cols2, int[][] A, int[][] B, int[][] C) {

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}