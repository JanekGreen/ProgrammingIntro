package firstprogram;

public class OperatorsProgram {
    public static void main(String[] args) {
        //operatory
        //arytmetyczne
        int numberOne = 1;
        int numberTwo = 2;
        // do zmiennej sum zostanie zapisany wynik operacji
        int sum = numberOne + numberTwo;
        System.out.println("Suma: " + (numberOne + numberTwo));
        System.out.println("Suma: " + sum);
        int diff = numberOne - numberTwo;
        System.out.println("Różnica " + diff);
        int mult = numberOne * numberTwo;
        System.out.println("Iloczyn " + mult);
        int div = numberTwo / numberOne;
        System.out.println("iloraz " + div);

        int rest = 5 % 2; // 2 mieści się w 5 2 razy i mamy 1 reszty
        System.out.println("modulo +" + rest);
        // 8+2
        int someNumber = 8;
        int otherNumber = 2;
        int suma = someNumber + otherNumber;

        System.out.println("suma " + suma);
        System.out.println("suma " + (someNumber + otherNumber));
        //operatory arytmetyczne działają na dwóch liczbach
        //a+b - a i b nazywamy operandami a + operatorem
        int thirdNumber = 100;
        int totalSum = thirdNumber + someNumber * otherNumber; //(kolejność taka jak w matematyce  * / % + -)
        double weight = 100.0 + 10; // wynik tej operacji będzie doublem/ double dominuje inta
        // inkrementacja i dekrementacja zwiększenie/zmniejszenie wartości o 1
        int shoeSize = 44; // zwiększam o 1
        shoeSize = shoeSize + 1; // długa kłopotliwa wersja
        shoeSize++; //skrót w postaci inkrementacji
        //shoeSize = shoeSize + 1 to samo co shoeSize++
        shoeSize = shoeSize - 1;
        shoeSize--; //shoeSize = shoeSize - 1 to samo co shoeSize--

        int numberOfFriends = 1;
        System.out.println("number of friends " + numberOfFriends++); // zwróci 1 jeżeli ++ jest za zmienną (postinkrementacja)
        System.out.println(numberOfFriends); // wartość zaktualizowana tutaj zwraca dwa
        System.out.println("number of friends " + ++numberOfFriends); // preinkrementacja od razu zwiększa wartość wynik
        System.out.println("number of friends " + --numberOfFriends);// dekrementacja predekrementacja wynik od razu: 2
        System.out.println("number of friends " + numberOfFriends--);// dekrementacja wynik 2 a w następnym wywołaniu 1

        //operatory porównania zwracają true lub false
        int secretNumber = 1;
        int secretNumber2;
        boolean result = 1 == 1; // rezultat true
        secretNumber2 = 2;
        result = secretNumber2 != secretNumber; //rezultat true
        //2          //1
        result = secretNumber2 > secretNumber; //true
        result = secretNumber2 < secretNumber;//false
        result = secretNumber2 >= secretNumber; //true
        result = secretNumber2 <= secretNumber;//false

        // operatory logiczne - działają na wartościach typu boolean true/false w rezultacie dostjemy również boolean
        boolean isMale = true;
        boolean isWeekend = true;
        // wykonuję operacja logicznego and. && zwraca true tylko i wyłącznie gdy dwie wartości są prawdziwe
        result = isMale && isWeekend; // true
        isMale = false;
        result = isMale && isWeekend; // false
        //operacja logicznego or || wystarczy że jedna ze zmiennych isMale i isWeekend ma wartość true dostaniemy w rezultacie true. Nie ważne która
        //w przeciwnym wypadku dostaniemy false
        result = isMale || isWeekend; // true

        // łączenie operatorów
        int age = 17;
        isMale = true;
        // czy może wejść do nocnego klubu. Może wejść gdy jest pełnoletni i jest facetem;

        boolean canEnterNightClub = (age >= 18) && (isMale == true);
        // czy może wejść do nocnego klubu. Może wejść gdy jest pełnoletni lub jest facetem;
        canEnterNightClub = (age >= 18) || (isMale == true);  // 17 letniego faceta // zwraca true

        //1 -3 wiek przyjęcia do złobka

        age = 2;
        //zmienna true lub false oznaczająca czy dziecko może dostać się do złobka
        // ktoś musi być starszy niż 0 i młodszy niż 4
        //1 -3 wiek przyjęcia do złobka
        // ktoś musi 1 lub więcej && nie więcej niż 3
        boolean canEnterPreschool = (age > 0) && (age < 4);
        canEnterPreschool = (age >= 1) && (age <= 3);
        System.out.println(canEnterPreschool);
        //true po negacji mam false
        boolean negation = !canEnterPreschool;
        System.out.println(negation);
        boolean canDrinkBeer = false;
        negation = !canDrinkBeer;//true

        //operatory bitowe przykład bitowe and (&)
        int bitwiseResult = 4 & 2;
        // 100
        //010
        //000
        System.out.println(bitwiseResult);
        // Operatory przypisania
        int numberA = 7;
        //dodaje do luckyNumeber 3
        numberA = numberA + 3;
        //skrótowo można skorzystać z +=
        numberA += 3;
        numberA = numberA - 3;
        //skrótowo można skorzystać z +=
        numberA -= 3;
        numberA = numberA * 3;
        numberA *= 3;
        numberA = numberA / 3;
        numberA /=3;
        //- i +
        int negativeNumber = -numberA;
         negativeNumber = +numberA;
       /* int result = */

        /*operatory mają kolejność wykonywania. Najważniejsze aby wiedzieć, że logiczne && jest wykonywane przed logicznym || */
        boolean haveFunds = true; // mam pieniądze
        boolean cookiesInStock = false; // ciastek nie ma w sklepie
        boolean juiceInStock = true;  //sok jest w sklepie
        boolean willBuySomething =   juiceInStock || haveFunds && cookiesInStock; // taka kolejność kolejność  juiceInStock || (haveFunds && cookiesInStock);
        willBuySomething =   (juiceInStock || haveFunds) && cookiesInStock;

        boolean a = false;
        boolean b = false;
        boolean c = true;
        System.out.println(a == b == c);  // zawsze true ponieważ kolejność będzie od lewej do prawej (a == b ) zwróci true, później porównamy wynik z c i dostaniemy w wyniku true
        // zawsze przy skomplikowanych warunkach wymuszamy kolejność nawiasami
        int x = 5;
        int y = 10;
        int z = x++ * y; // wynik 50
        System.out.println(z);
        System.out.println(x);


        System.out.println("1 + 2 = " + 1 + 2); // wynik 12 bo inty zostały skonwertowane na Stringa
        // następuje konwersja , pierwszy mamy string 1 zostanie zamienione na stringa
        String var = "1 + 2" +1;
        // jak to naprawić, wymusić kolejność nawiasem
        System.out.println("1 + 2 = " + (1 + 2)); // problem występuje tylko  z + bo służy nam do łączenia napisów
        // ZADANIE

        // zadeklaruj liczbę całkowitą wymyśloną przez ciebie wartością a następnie ułóż warunek sprawdzający czy ta liczba jest z
        //zakresu 244- 1000. Wynik sprawdzenia zapisz w zmiennej logicznej

        int number = 8;
        // number jest większy niż dolny zakres i jednocześnie number jest mniejszy niż górny zakres
        boolean isInRange = (number >=  244)  &&  (number <=1000);
        System.out.println(isInRange);




    }
}
