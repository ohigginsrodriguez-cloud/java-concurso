import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(solve(x, y));
        }

    }

    static int solve(int x, int y) {
        int primeros = x * 10;
        int resto = y * 90;
        int total = primeros + resto;
        return total;
    }
}
