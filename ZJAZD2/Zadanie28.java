public class Zadanie28 {
    public static void main(String[] args) {
        boolean value1, value2;

        System.out.println("Tabela prawdy dla operatorów logicznych:");
        System.out.println("=======================================");

        // Nagłówki kolumn
        System.out.println("| Wartość 1 | Wartość 2 |  AND  |  OR   |  NOT  |");
        System.out.println("-------------------------------------------");

        // Wiersze tabeli prawdy
        // Wartość 1: true
        value1 = true;
        // Wartość 2: true
        value2 = true;
        System.out.println("|   " + value1 + "    |    " + value2 + "    | " + (value1 && value2) + "  | " + (value1 || value2) + " | " + !value1 + " |");

        // Wartość 2: false
        value2 = false;
        System.out.println("|   " + value1 + "    |    " + value2 + "   | " + (value1 && value2) + " | " + (value1 || value2) + " | " + !value1 + " |");

        // Wartość 1: false
        value1 = false;
        // Wartość 2: true
        value2 = true;
        System.out.println("|   " + value1 + "   |    " + value2 + "    | " + (value1 && value2) + " | " + (value1 || value2) + " | " + !value1 + " |");

        // Wartość 2: false
        value2 = false;
        System.out.println("|   " + value1 + "   |    " + value2 + "   | " + (value1 && value2) + " | " + (value1 || value2) + " | " + !value1 + " |");

        System.out.println("-------------------------------------------");
    }
}
