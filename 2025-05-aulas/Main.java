import java.util.*;

public class Main {

    static Deque<Integer> libres = new ArrayDeque<>();
    static Deque<Integer> asignadas = new ArrayDeque<>();
    static Scanner sc = new Scanner(System.in);
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {

        while (sc.hasNext()) {

            String cmd = sc.next();
            if (cmd.equals("L")) { // si se quiere liberar
                int id = sc.nextInt();

                if (asignadas.contains(id)) { // si en las asignadas esta ese id
                    asignadas.remove(id);
                    libres.addLast(id);
                } else {
                    libres.addLast(id); // si no existe se agrega
                }

            } else if (cmd.equals("A")) { // si se quiere asignar
                if (libres.isEmpty()) { // si no hay disponibles
                    output.append("NINGUNA\n"); // se imprime ninguna
                }
                String type = sc.next();
                if (type.equals("E") && !libres.isEmpty()) { // si escoge E y hay aulas
                    int element = libres.removeLast();
                    asignadas.addFirst(element); // se agrega a asignadas la ultima de las libres y se
                    output.append(element).append("\n");
                    // elimina de libres
                }
                if (type.equals("C")) { // si escoge C
                    if (!libres.isEmpty()) {
                        int element = libres.removeFirst();
                        asignadas.addFirst(element); // se agrega a asignadas la primer aula y se elimina de
                        output.append(element).append("\n");
                        // libres
                    }

                }
            }
        }
        System.out.println(output);
    }
}