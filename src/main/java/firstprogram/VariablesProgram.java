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
        // część dziesiętną odznaczamy kropką
        double weightDouble = 72.5;
        float weight = 72.5f;

        char gender = 'M'; //'F' // reprezentuje pojedynczy symbol w tekście
        // tworzenie zmiennych przechowujących napisy
        String firstName = "Pawel"; // można o tym napisie myśleć jako o ciągu charów 'P'+'a'+'w'+'e'+'l'
        //napis umieszczamy pomiędzy cudzysłowami
        int age = 12; // liczba
        String ageString ="12"; // napis

        System.out.println(firstName);
        System.out.println(firstName+" "+age); // konkatenacja łączenie kilku Stringów w jeden przy użyciu +
        // metody na Klasie string (specjalne funkcje do dyspozycji gdy chcemy działać na tej klasie)
        // na stworzonym stringu wykonujemy są dostępne po kropce jak niżej
        // ile liter ma string
        System.out.println(firstName.length());
        String empty = "";
        System.out.println(empty.isEmpty()); // zwróci true gdy string będzie pusty

        firstName ="Robert";
        System.out.println("Cześć jestem "+ firstName);

        //STAŁE - nadajemy wartość tylko raz przy deklaracji
        //słówko final przed typ, konwencja jest taka, aby nazwy skladaly sie z duzych liter
       final float PI =3.14f;
      //  PI = 6.0f; nie możemy zmieniać wartości
      // możemy definiować stałe każdego typu final int ADULT_AGE =18
       final int ADULT_AGE =18; // używamy podkreślnika _ aby oddzielać człony nazwy od siebie
        final String SAMPLE_NAME = "John";
        // na stałym stringu tak jak na zmiennej, można wywoływać metody length() etc



    }
}
