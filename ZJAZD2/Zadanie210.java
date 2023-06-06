public class Zadanie210 {
    public static void main(String[] args) {
        int n = 14;

        System.out.println("Potęgi liczby 2:");

        for (int i = 0; i <= n; i++) {
            long result = (long) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
