package firstprogram;

import java.util.Scanner;

public class ClassExample {
    public static void main(String[] args) {
        // jak użyć naszej klasy, stworzyć obiekt!
        // obiekty tworzymy podobnie do deklaracji zmiennych
        //typ //dowolna nazwa // wywołanie;
        // na podstawie klasy, stworzyłem konkretny obiekt
        Human czlowiek1 = new Human("Janek", 20);
        //mogę stworzyć więcej obiektów danego typu:
        Human czlowiek2 = new Human("Aneta", 34);
        //jak wyświetlić imie czlowieka?
        System.out.println(czlowiek1.name);
        //jak wyświetlić wiek czlowieka?
        System.out.println(czlowiek1.age);
        //po kropce mamy dostęp no metod zdefiniowanych w klasie Human
        czlowiek1.introduceYourself();
        // typ zwracany int
        int doubleAge =  czlowiek1.doubleAge();
        System.out.println("Podwójny wiek "+doubleAge);
        czlowiek1.greetSomeone("Pawel");

        // jeżeli nie podamy w konstruktorze jakiegoś pola, to wartością domyśle
        Human czlowiek3 = new Human("Anna");
        System.out.println(czlowiek3.age);

        //jeżeli nie utworzymy konstruktora, kompilator nam sam wygeneruje konstruktor bezparametrowy
        // jeżeli utworzymy konstruktor, to ten domyślny bezparametrowy nam zniknie.
        Car car = new Car();
        car.model = "A5";
        //dwa równoważne sposoby
        String producer = car.getProducer();
        System.out.println(producer);
        System.out.println(car.getProducer());
        //jak ustawić pole wewnątrz klasy po jej stworzeniu
        //setter
        car.setProducer("Audi");
        producer = car.getProducer();
        System.out.println(producer);
        //car.producer = "Audi";
        //jak spowodować aby nie dało się modyfikować pól obiektu
        Scanner s = new Scanner(System.in);
        //metoda klasy scanner, która zwraca inta  z klawiatury
       //s.nextInt()


    }
}
