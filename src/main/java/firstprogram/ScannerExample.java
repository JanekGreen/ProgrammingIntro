package firstprogram;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        System.out.println("Liczba jaką podałeś to: "+number);
    }
}
