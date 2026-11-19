import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] decimal = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int count = 0;

        for (int i = 0; i < decimal.length; i++) {
            while (n >= decimal[count]) {
                System.out.print(roman[count]);
                n -= decimal[count];
                if (n <= 0) {
                    break;
                }
            }
            count++;
        }
        System.out.println();
    }
}