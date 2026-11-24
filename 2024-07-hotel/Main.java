import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); // casos prueba

        for (int i = 0; i < t; i++) {
            ArrayList<Integer> llegadas = new ArrayList<>();
            ArrayList<Integer> salidas = new ArrayList<>();
            int n = sc.nextInt(); // huespedes

            for (int j = 0; j < n; j++) {
                int x = sc.nextInt(); // hora llegada
                llegadas.add(x);
            }

            for (int k = 0; k < n; k++) {
                int z = sc.nextInt(); // hora salida
                salidas.add(z);
            }

            System.out.println(solve(llegadas, salidas));
        }
    }

    static int solve(ArrayList<Integer> llegadas, ArrayList<Integer> salidas) {
        int current = 0;
        int best = 0;
        llegadas.sort(null);
        int idxLlegada = 0;
        int idxSalida = 0;
        salidas.sort(null);

        while (idxLlegada < llegadas.size()) {
            if (llegadas.get(idxLlegada) < salidas.get(idxSalida)) {
                current++;
                idxLlegada++;
            } else if (salidas.get(idxSalida) <= llegadas.get(idxLlegada)) {
                current--;
                idxSalida++;
            }
            if (current > best) {
                best = current;
            }
        }
        return best;
    }
}