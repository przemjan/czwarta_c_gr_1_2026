import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        int numerButa;

        System.out.println("Podaj numer buta: ");
        numerButa = skaner.nextInt();
        skaner.nextLine();

        System.out.println("Podaj średnią z niemieckiego: ");
        double srednia = skaner.nextDouble();
        skaner.nextLine();

        System.out.println("Podaj imię: ");
        String name = skaner.nextLine();

        System.out.println("Twój numer buta: " + numerButa +
                ", twoja średnia: " + srednia + ", imię: " + name);


    }
}
