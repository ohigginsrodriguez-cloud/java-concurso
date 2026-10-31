import java. util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int actual= 0;
        int best = 0;

        System.out.print("days num: ");
        int nDays = sc.nextInt();

        int[] days = new int[nDays];

        for(int i = 0; i < days.length; i++) {
            System.out.print("hours per day " + (i + 1) + " :");
            days[i] = sc.nextInt();
        }

        for(int i = 0; i < days.length; i++) {

            if(days[i] >= 6) {
                actual++;
            } else  {
                if(actual > best) {
                    best = actual;
                }
                actual = 0;
            } 
        }
        System.out.print("best streak: " + best);
    }
}
