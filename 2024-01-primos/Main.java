import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n prime numbers: ");
        int n = sc.nextInt();

        sc.close();
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for(int i = 0; i < n; i++)
    }
}
