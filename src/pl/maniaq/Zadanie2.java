package pl.maniaq;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();

        System.out.println("Podaj wzrost: ");
        int height = scanner.nextInt();

        System.out.println("Podaj wagę: ");
        float weight = scanner.nextFloat();

        System.out.println("Nazywasz się " + name + " " + lastName + ", masz " + age + " lat, masz " + height + " cm wzrostu oraz ważysz " + weight + " kg.");
    }
}
