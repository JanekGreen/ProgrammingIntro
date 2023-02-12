package firstprogram;

public class OperatorsProgram {
    public static void main(String[] args) {
        //operatory
        //arytmetyczne
        int numberOne = 1;
        int numberTwo = 2;
        // do zmiennej sum zostanie zapisany wynik operacji
        int sum = numberOne + numberTwo;
        System.out.println("Suma: "+ (numberOne + numberTwo));
        System.out.println("Suma: "+ sum);
        int diff = numberOne - numberTwo;
        System.out.println("Różnica "+diff);
        int mult = numberOne *  numberTwo;
        System.out.println("Iloczyn "+mult);
        int div = numberTwo / numberOne;
        System.out.println("iloraz "+div);

        // 8+2
        int someNumber = 8;
        int otherNumber = 2;
        int suma = someNumber + otherNumber;

        System.out.println("suma "+ suma);
        System.out.println("suma "+ (someNumber + otherNumber));
    }
}
