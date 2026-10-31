import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n prime numbers: ");
        int n = sc.nextInt();

        int count = 0;
        int i = 0;

        while(count < n) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }

        sc.close();
    }

    public static boolean isPrime(int value) {
        if(value < 2) {
            return false;
        }

        for(int i = 2; i < value; i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
