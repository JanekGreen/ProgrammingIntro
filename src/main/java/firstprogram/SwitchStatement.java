package firstprogram;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Podaj dzień tygodnia: ");
        Scanner scanner = new Scanner(System.in);
        // różnica pomiędzy wyrażeniem a instrukcją (statement vs expression)
        int day = scanner.nextInt();
        scanner.nextLine();
        //switch porównuje wartości do poszczególnych case'ów, w przypadku gdy trafi na pasujący case, nie sprawdza kolejnych
        //można używać dowolnej zmiennej prymitywnej, czyli:
        /*
        typy proste: byte, short, char, int
        odpowiadające im klasy opakowujące: Byte, Short, Character, Integer
        String
        enum
        * */
        switch (day) {
            case 1:
                System.out.println("Poniedzialek.");
                //może być tutaj więcej kodu
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
        // nowa wersja switcha od Javy 11
        switch (day) {
            case 1 -> System.out.println("Poniedzialek.");
            case 2 -> System.out.println("Wtorek.");
            case 3 -> System.out.println("Sroda.");
            case 4 -> System.out.println("Czwartek.");
            case 5 -> System.out.println("Piatek.");
            case 6 -> System.out.println("Sobota.");
            case 7 -> System.out.println("Niedziela.");
            default -> System.out.println("Nieznany dzien tygodnia!");
        }
        String name ="Jan";
        switch (name){
            case "Jan":
                System.out.println("Cześć Janek");
                break;
            case "Magda":
                System.out.println("Hej Magda");
                break;
            default: // default to jest taki else, zostanie dopasowany do każdej innej wartości
                    // niż te zdefiniowane powyzej. Występuje zawsze na końcu
                    //może go nie być
                System.out.println("Nie znam Cię");
        }
        // wyrażenie ma jakąś wartość, można przypisać do zmiennej (expression)
        //instrukcja to po prostu najmniejszy fragment kodu który można wykonać

    }
}
