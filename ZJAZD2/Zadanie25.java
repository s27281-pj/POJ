public class Zadanie25 {
    public static void main(String[] args) {
        // Operator inkrementacji i dekrementacji
        int a = 5;
        int b = ++a; // Inkrementacja a przed przypisaniem wartości do b
        int c = --a; // Dekrementacja a przed przypisaniem wartości do c

        System.out.println("Operator inkrementacji i dekrementacji:");
        System.out.println("a = " + a); // Wyświetla 4
        System.out.println("b = " + b); // Wyświetla 5
        System.out.println("c = " + c); // Wyświetla 4

        // Operator arytmetyczny
        int x = 10;
        int y = 3;
        int suma = x + y; // Dodawanie
        int roznica = x - y; // Odejmowanie
        int iloczyn = x * y; // Mnożenie
        int iloraz = x / y; // Dzielenie całkowite
        int reszta = x % y; // Reszta z dzielenia

        System.out.println("\nOperator arytmetyczny:");
        System.out.println("Suma: " + suma); // Wyświetla 13
        System.out.println("Różnica: " + roznica); // Wyświetla 7
        System.out.println("Iloczyn: " + iloczyn); // Wyświetla 30
        System.out.println("Iloraz: " + iloraz); // Wyświetla 3
        System.out.println("Reszta z dzielenia: " + reszta); // Wyświetla 1

        // Operator relacyjny
        int p = 5;
        int q = 7;
        boolean rowne = p == q; // Równe
        boolean nierowne = p != q; // Nierówne
        boolean wieksze = p > q; // Większe niż
        boolean mniejsze = p < q; // Mniejsze niż
        boolean wiekszeRowne = p >= q; // Większe lub równe
        boolean mniejszeRowne = p <= q; // Mniejsze lub równe

        System.out.println("\nOperator relacyjny:");
        System.out.println("Czy równe? " + rowne); // Wyświetla false
        System.out.println("Czy nierówne? " + nierowne); // Wyświetla true
        System.out.println("Czy większe? " + wieksze); // Wyświetla false
        System.out.println("Czy mniejsze? " + mniejsze); // Wyświetla true
        System.out.println("Czy większe lub równe? " + wiekszeRowne); // Wyświetla false
        System.out.println("Czy mniejsze lub równe? " + mniejszeRowne); // Wyświetla true
    }
}
