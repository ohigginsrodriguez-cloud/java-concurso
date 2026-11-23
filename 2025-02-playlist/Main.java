import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> bajas = new ArrayList<>();
    static ArrayList<Integer> altas = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("Ingrse el numero de canciones: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la valoracion cancion " + (i + 1) + ": ");
            int val = sc.nextInt();
            if (val > 3) {
                altas.add(val);
            } else {
                bajas.add(val);
            }
        }

        int count = 0;
        int[] alternada = new int[n];
        while (count < n) {
            if (!altas.isEmpty()) {
                alternada[count] = altas.remove(0);
                count++;
            }
            if (!bajas.isEmpty()) {
                alternada[count] = bajas.remove(0);
                count++;
            }
        }
        System.out.println("Playlist alternada: " + Arrays.toString(alternada));
    }
}