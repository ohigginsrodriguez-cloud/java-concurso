import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> bajas = new ArrayList<>();
    static ArrayList<Integer> altas = new ArrayList<>();
    static ArrayList<Integer> alternada = new ArrayList<>();

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

        while (!altas.isEmpty() || !bajas.isEmpty()) {
            if (!altas.isEmpty()) {
                alternada.add(altas.remove(0));
            }
            if (!bajas.isEmpty()) {
                alternada.add(bajas.remove(0));
            }
        }
        System.out.println("Playlist alternada: " + alternada);
    }
}