import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int r1 = ask("Ingrese el numero de filas de la primera matriz: ");
        int c1 = ask("Ingrese el numero de columnas de la primera matriz: ");
        int r2 = ask("Ingrese el numero de filas de la segunda matriz: ");
        int c2 = ask("Ingrese el numero de columnas de la segunda matriz: ");

        if (c1 != r2) {
            System.out.println("No se puede multiplicar");
            return;
        }

        System.out.println("Ingrese los elementos de la primera matriz:");
        int[][] A = fillMatrix(r1, c1);
        System.out.println("Ingrese los elementos de la segunda matriz:");
        int[][] B = fillMatrix(r2, c2);

        int[][] C = new int[r1][c2];

        multiply(A, B, C);
        printMatrix(C);
    }

    static int ask(String s) {
        System.out.print(s);
        return sc.nextInt();
    }

    static int[][] fillMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                m[i][j] = sc.nextInt();
        return m;
    }

    static void multiply(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m)
            for (int v : row)
                System.out.print(v + " ");
        System.out.println();
    }
}