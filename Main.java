import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj swoje nazwisko: ");
        String nazwisko = scanner.nextLine();

        String pelneImie = imie + " " + nazwisko;

        System.out.println("Twoje pełne imię: " + pelneImie);

        scanner.close();
    }
}
