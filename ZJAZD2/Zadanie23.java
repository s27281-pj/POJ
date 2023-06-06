public class Zadanie23 {
    public static void main(String[] args) {
        // Typy całkowite
        byte defaultValueByte = 0;
        short defaultValueShort = 0;
        int defaultValueInt = 0;
        long defaultValueLong = 0L;

        // Typy zmiennoprzecinkowe
        float defaultValueFloat = 0.0f;
        double defaultValueDouble = 0.0;

        // Typ logiczny
        boolean defaultValueBoolean = false;

        // Typ znakowy
        char defaultValueChar = '\u0000';

        System.out.println("Domyślne wartości typów prostych:");
        System.out.println("byte: " + defaultValueByte);
        System.out.println("short: " + defaultValueShort);
        System.out.println("int: " + defaultValueInt);
        System.out.println("long: " + defaultValueLong);
        System.out.println("float: " + defaultValueFloat);
        System.out.println("double: " + defaultValueDouble);
        System.out.println("boolean: " + defaultValueBoolean);
        System.out.println("char: " + defaultValueChar);
    }
}
