import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int x = sc.nextInt(); //escuelas
            int y = sc.nextInt(); //estudiantes
            int z = sc.nextInt(); //aprobados
            
            int totalY = y * x;

            if(aprobaron(totalY, z)) {
                System.out.print("Si\n");
            } else {
                System.out.print("No\n");
            }
        }

        sc.close();
    }
    public static boolean aprobaron(int totalY, int z) {
        int mitad = totalY / 2;
        if(z > mitad) {
            return true;
        }
        return false;
    }
}
