import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); // casos prueba

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // huespedes
            ArrayList<Integer> llegadas = new ArrayList<>();
            ArrayList<Integer> salidas = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                llegadas.add(sc.nextInt());// hora llegada
            }

            for (int k = 0; k < n; k++) {
                salidas.add(sc.nextInt());// hora salida
            }
            System.out.println(solve(llegadas, salidas));
        }
    }

    static int solve(ArrayList<Integer> llegadas, ArrayList<Integer> salidas) {
        int current = 0;
        int best = 0;
        int idxSalida = 0;
        int idxLlegada = 0;

        llegadas.sort(null);
        salidas.sort(null);

        while (idxLlegada < llegadas.size()) {
            if (llegadas.get(idxLlegada) < salidas.get(idxSalida)) {
                current++;
                idxLlegada++;
                best = Math.max(current, best);
            } else {
                current--;
                idxSalida++;
            }
        }
        return best;
    }
}