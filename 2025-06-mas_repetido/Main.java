import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> products = new HashMap<>();

    public static void main(String[] args) {
        System.out.print("Ingrese el numero de productos: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el producto " + (i + 1) + ": ");
            String name = sc.nextLine();
            products.put(name, products.getOrDefault(name, 0) + 1);
        }

        int maxVal = Collections.max(products.values());
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (maxVal == entry.getValue()) {
                System.out.println("Producto mas comprado: " + entry.getKey() + " (" + entry.getValue() + " veces)");

            }
        }
    }
}