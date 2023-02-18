package firstprogram;

import java.util.Scanner;

public class LoopsAndIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int input;
        do {
            System.out.println("Proszę podać liczbę dodatnią");

            while (!scanner.hasNextInt()){
                System.out.println("Nie wprowadzono liczby. Próbuj dalej");
                scanner.nextLine();

            }
            input = scanner.nextInt();
            if(input<0){

                System.out.println("Liczba ujemna, wracamy do początku");

            }else if (input == 0){
                System.out.println("Podałeś 0 jesteś blisko");
            }
      } while (input<=0);
        System.out.println("Dzięki, mam liczbę dodatnią "+input);
    }

}
