import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int drugaliczba = scanner.nextInt();

        int suma = liczba + drugaliczba;

        System.out.println(suma);

        scanner.close();
    }
}
