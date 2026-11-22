import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (solve(num1, num2)) {
            System.out.println("Amigos");
        }
    }

    static boolean solve(int n1, int n2) {

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < n1; i++) {
            if (i != n1) {
                if (n1 % i == 0) {
                    total1 += i;
                }
            }

        }
        for (int j = 1; j < n2; j++) {
            if (j != n2) {
                if (n2 % j == 0) {
                    total2 += j;
                }
            }
        }

        if (total1 == n2 && total2 == n1) {
            return true;
        }
        return false;
    }
}