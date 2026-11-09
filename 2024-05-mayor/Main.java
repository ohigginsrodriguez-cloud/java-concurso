import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solve(n));

        sc.close();
    }

    static int solve(int n) {
        int max = -1;
        while (n != 0) {
            int dig = n % 10;
            if (dig > max) {
                max = dig;
            }
            n = n / 10;
        }
        return max;
    }
}
