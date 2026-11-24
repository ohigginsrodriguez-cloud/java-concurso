import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        ArrayList<Integer> primos = primos(n);
        ArrayList<Integer> fibo = fibo(n);

        int sumaNum = 0;
        int sumaDen = 1;
        for (int i = 0; i < fibo.size(); i++) {
            int numerador = fibo.get(i);
            int denominador = primos.get(i);

            System.out.print(numerador + "/" + denominador + " ");
            sumaNum = sumaNum * denominador + numerador * sumaDen;
            sumaDen = sumaDen * denominador;
        }
        System.out.println("suma: " + sumaNum + "/" + sumaDen);

    }

    static ArrayList<Integer> fibo(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int a = 0;
        int b = 1;
        int fibo = 1;

        for (int i = 0; i < n; i++) {
            fibonacci.add(fibo);
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibonacci;
    }

    static boolean esPrimo(int val) {
        if (val < 2) {
            return false;
        }

        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> primos(int n) {

        ArrayList<Integer> primosList = new ArrayList<>();
        int i = 0;
        int primos = 0;
        while (primos < n) {
            if (esPrimo(i)) {
                primosList.add(i);
                primos++;
            }
            i++;
        }
        return primosList;
    }
}