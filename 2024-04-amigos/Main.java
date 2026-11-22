import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == solve(num2) && num2 == solve(num1)) {
            System.out.println("Amigos");
        } else {
            System.out.println("No son amigos");
        }
    }

    static int solve(int n) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        return total;
    }
}