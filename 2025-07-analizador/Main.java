import java.io.File;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        Map<String, Integer> contador = new HashMap<>();
        try (Scanner file = new Scanner(new File("file.txt"))) {
            while (file.hasNextLine()) {
                String line = file.nextLine().toLowerCase();
                line = line.replaceAll("[^\\p{L}\\p{N}\\s]", " ");
                String[] words = line.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                    contador.put(words[i], contador.getOrDefault(words[i], 0) + 1);
                }
            }

            System.out.println("Las " + n + " palabras mas comunes (sin stop words): ");
            for (int i = 0; i < n; i++) {
                int max = Collections.max(contador.values());
                String tmp = "";
                for (Map.Entry<String, Integer> e : contador.entrySet()) {
                    if (e.getValue() == max) {
                        System.out.println((i + 1) + " " + e.getKey() + " " + e.getValue() + " veces");
                        tmp = e.getKey();
                        break;
                    }
                }
                contador.remove(tmp);
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}