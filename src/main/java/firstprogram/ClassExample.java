package firstprogram;

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


    }
}
