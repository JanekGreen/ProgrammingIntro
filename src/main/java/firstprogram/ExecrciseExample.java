package firstprogram;

import java.util.Scanner;

public class ExecrciseExample {
    // Pobierz wiek od użytkownika i wyświetl "Jesteś seniorem jeżeli jest starszy niż 65 lat)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek:");
        int age = scanner.nextInt();
        if (age>65){
            System.out.println("Jesteś seniorem");
        }
    }
}
