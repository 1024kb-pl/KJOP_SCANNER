package pl.maniaq;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbę: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;

        System.out.println("Wynik dodawania: " + sumResult);
        System.out.println("Wynik odejmowania: " + subtractResult);
    }
}
