package firstprogram;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Podaj dzień tygodnia: ");
        Scanner scanner = new Scanner(System.in);
        // różnica pomiędzy wyrażeniem a instrukcją (statement vs expression)
        int day = scanner.nextInt();
        scanner.nextLine();
        switch (day) {
            case 1:
                System.out.println("Poniedzialek.");
                break;
            case 2:
                System.out.println("Wtorek.");
                break;
            case 3:
                System.out.println("Sroda.");
                break;
            case 4:
                System.out.println("Czwartek.");
                break;
            case 5:
                System.out.println("Piatek.");
                break;
            case 6:
                System.out.println("Sobota.");
                break;
            case 7:
                System.out.println("Niedziela.");
                break;
            default:
                System.out.println("Nieznany dzien tygodnia!");
        }

    }
}
