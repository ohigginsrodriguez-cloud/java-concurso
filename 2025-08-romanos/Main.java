import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] decimal = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < decimal.length; i++) {
            while (n >= decimal[i]) {
                System.out.print(roman[i]);
                n -= decimal[i];
            }
        }
        System.out.println();
    }
}