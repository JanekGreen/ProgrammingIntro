package firstprogram;

import java.util.Scanner;

public class ExerciseLoops {
    public static void main(String[] args) {
        // zad 1.1
        int sum = 0;
        for (int i = 50; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Suma: " + sum);
        //zad 1.2
        int counter = 50;
        sum = 0;
        do {
            sum += counter;
            counter++;

        } while (counter <= 100);
        System.out.println("Suma " + sum);
        //zad 2
        for (int i = 2; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        //2.2
        System.out.println("Parzyste z continue");
        for (int i = 2; i <= 20; i++) {

            if (i % 2 != 0) {
                // wejdziemy do ifa w przypadku liczby nieparzystej, wykonamy continue i przejdziemy od razu do innej iteracji
                continue;
            }
            System.out.println(i);
        }
        // zad 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        int factorial = 1;
        //5! =1*2*3*4*5
        for (int i = 1; i <= number; i++) {
            //factorial=factorial*i;
            factorial*=i;
        }
        System.out.println("Silnia z liczby: "+number+": "+factorial );
    }
}
