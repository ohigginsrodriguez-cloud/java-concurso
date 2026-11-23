import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine().toLowerCase();

        System.out.println(count(s, "itsv"));
        System.out.println(count(s, "valladolid"));
        System.out.println(count(s, "sistema"));
    }

    static int count(String text, String word) {
        int quant = 0;
        int position = text.indexOf(word);

        while (position != -1) {
            quant++;
            position = text.indexOf(word, position + 1);
        }

        return quant;
    }
}