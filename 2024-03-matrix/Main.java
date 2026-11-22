import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows1 = ask("Ingrese el numero de filas de la priimera matriz: ");
        int cols1 = ask("Ingrese el numero de columnas de la priimera matriz: ");
        int rows2 = ask("Ingrese el numero de filas de la segunda matriz: ");
        int cols2 = ask("Ingrese el numero de columnas de la segunda matriz: ");

        if (cols1 != rows2) {
            System.out.println("no se puede multiplicar");
            return;
        }

        System.out.println("Ingrese los elementos de la primera matriz: ");
        int[][] A = readMatrix(rows1, cols1);

        System.out.println("Ingresa los elementos de la segunda matriz: ");
        int[][] B = readMatrix(rows2, cols2);
        int[][] C = new int[rows1][cols2];

        multiply(A, B, C);
        printMatrix(C);
    }

    static int ask(String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    static int[][] readMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = sc.nextInt();
        return m;
    }

    static void multiply(int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    C[i][j] += A[i][k] * B[k][j];
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m)
            for (int v : row)
                System.out.print(v + " ");
        System.out.println();
    }
}