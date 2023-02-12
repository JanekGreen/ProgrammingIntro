package firstprogram;

// variable - zmienna
public class VariablesProgram {

    public static void main(String[] args) {
        //tworzenie zmiennej - deklaracja zmiennej o nazwie variableInt przechowującej liczby całkowite
        // int - typ zmiennej
        // variableInt - nazwa
        int variableInt;
        // wrzucam do zmiennej liczbę całkowitą 1 - inicjalizacja
        variableInt = 1;
        System.out.println(variableInt);
        // zmieniam liczbę w zmiennej
        variableInt = 2;
        System.out.println(variableInt);
        // deklaracja i inicjalizacja razem
        int variableIntTwo = 2;

        // przy deklaracji trzeba zawsze podać typ i nazwę
         // variableIntThree = 3; jest na czerwono, nie zadziała

        //deklaracja różnych typów wraz z opisem
        //zainicjalizowana true// boolean przechowuje tylko true/false
        boolean male = true; // wartości logiczne prawda/fałsz
        boolean female = false;
        // male = 1; nie można przechować typu niekompatybilnego z zadeklarowanym
        byte numOfMembers = 10; // zakres od -128 do 127
        // numOfMembers = 10000;  // nie można przechować za dużej ani za małej warości w zmiennej byte
       // short numOfMembers = 10000; // zmienna innego typu o tej nazwie już istnieje, nie można stworzyć kolejnej
        short numOfMembersShort = 10_000;
        numOfMembersShort = numOfMembers; // mogę przechować wartość ze zmiennej byte w każdej zmiennej całkowitej, bo ma większy zakres
        int calorieCount  = 2500; // większość liczb całkowitych tu będzie pasować. Programiści zazwyczaj uzywają int do liczb całkowitych
        //calorieCount = numOfMembers;
        //calorieCount = numOfMembersShort;
        long somethingSuperBig = 3000000000L; // wartości całkowite powyżej 2 miliardów i poniżej -2 miliardów
        //przy inicjalizacji longa musimy podawać L na końcu, inaczej dostaniemy błąd, Java interpretuje liczby całkowite automatycznie jako int

        // liczby zmiennoprzecinkowe (dziesiętne ułamki)
        // dla Javy, każda liczba z przecinkiem to jest double, przy inicjalizacji floata musimy dodać małe f na koniec.
        double weightDouble = 72.5;
        float weight = 72.5f;

        char gender = 'M'; //'F' // reprezentuje pojedynczy symbol w tekście

    }
}
