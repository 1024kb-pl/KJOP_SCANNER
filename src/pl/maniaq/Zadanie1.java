package pl.maniaq;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz coś: ");
        String text = scanner.nextLine();

        System.out.println("Wpisałeś: " + text);
    }
}
