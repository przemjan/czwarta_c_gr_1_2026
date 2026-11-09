public class StringDemo {
    public static void main(String[] args) {

        String name = "Eustachy";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        String duze, male;
        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println("Długość: " + dlugosc + ", inicjał: " + inicjal);
        System.out.println(duze);
    }
}
