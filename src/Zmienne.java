public class Zmienne {
    public static void main(String[] args) {
        int numer;
        numer = 13;

        double numer2 = 17.7;

        System.out.println("Moja zmienna: " + numer + " druga zmienna: " + numer2);

        int numer3;
        double numer4;

        numer4 = numer;
        numer3 = (int) numer2;
        System.out.println("Po castingu: " + numer3);

        int workHourPerDay = 8;
        int workDayPerWeek = 5;
        int weekPerYear = 52;
        int workHourPerYear = workHourPerDay * workDayPerWeek * weekPerYear;

        char znak = '$';

        String napis = "Dzisiaj \tjest \"ładnie\"";
        napis += ".";

        System.out.println("Mój napis " + napis);
        System.out.print("Mój napis " + napis + "\n");
        System.out.print("Mój napis " + napis);

        boolean sun = true; //false
    }
}
