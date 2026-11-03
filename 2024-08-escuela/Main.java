import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("catidad de casos de prueba: ");
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            System.out.print("Prueba  " + i + ": ingrese en una sola linea las cantidades de:  ESCUELAS, ESTUDIANTES, APROBADOS: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
        }


        sc.close();
    }
    public static boolean aprobaron(int y, int z) {
        int mitad = y / 2;
        if(z > mitad) {
            return true;
        }
        return false;
    }
}
