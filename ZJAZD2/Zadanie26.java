public class Zadanie26 {
    public static void main(String[] args) {
        int[][] tablica = new int[3][3];

        // Wypełnienie tablicy wartościami
        tablica[0][0] = 1;
        tablica[0][1] = 2;
        tablica[0][2] = 3;
        tablica[1][0] = 4;
        tablica[1][1] = 5;
        tablica[1][2] = 6;
        tablica[2][0] = 7;
        tablica[2][1] = 8;
        tablica[2][2] = 9;

        // Wyświetlenie tablicy przed zamianą wierszy
        System.out.println("Tablica przed zamianą:");
        wyswietlTablice(tablica);

        // Zamiana wierszy miejscami
        int[] temp = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = temp;

        // Wyświetlenie tablicy po zamianie wierszy
        System.out.println("\nTablica po zamianie:");
        wyswietlTablice(tablica);
    }

    // Metoda do wyświetlania tablicy
    public static void wyswietlTablice(int[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
