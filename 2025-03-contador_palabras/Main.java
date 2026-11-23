import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int itsvCount = 0;
        int valladolidCount = 0;
        int sistemaCount = 0;

        String s = sc.nextLine();
        s = s.toLowerCase();

        int itsvPosition = s.indexOf("itsv");
        int valladolidPosition = s.indexOf("valladolid");
        int sistemaPosition = s.indexOf("sistema");

        while (itsvPosition != -1 || valladolidPosition != -1 || sistemaPosition != -1) {

            if (itsvPosition != -1) {
                itsvCount++;
                itsvPosition = s.indexOf("itsv", itsvPosition + 1);
            }
            if (valladolidPosition != -1) {
                valladolidCount++;
                valladolidPosition = s.indexOf("valladolid", valladolidPosition + 1);

            }
            if (sistemaPosition != -1) {
                sistemaCount++;
                sistemaPosition = s.indexOf("sistema", sistemaPosition + 1);
            }
        }

        System.out.println(itsvCount);
        System.out.println(valladolidCount);
        System.out.println(sistemaCount);

    }
}