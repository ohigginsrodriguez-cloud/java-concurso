public class Main {
    public static void main(String args[]) {
        int perfectos = 0;
        int count = 1;

        while(perfectos < 3) {
            if(esPerfecto(count)) {
                System.out.println(count);
                perfectos++;
            }
            count++;
        }
    }

    public static boolean esPerfecto(int num) {

        int total = 0;
        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                total += i;
            }
        }

        if(total == num) {
            return true;
        }

        return false;
    }

}
