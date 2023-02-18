package firstprogram;

public class Arrays {
    public static void main(String[] args) {

        int[] yetAnotherArray = new int[]{1, 2, 3, 4, 5, 6};
        //Poprzez indeks odwołujemy się do konkretnego miejsca w pamięci gdzie znajduje się konkretna wartość
        // indeksy są numerowane od zera.
        System.out.println("Pierwszy element w tablicy: " + yetAnotherArray[0]);
        System.out.println("Drugi element w tablicy: " + yetAnotherArray[1]);
        System.out.println("Ostatni element w tablicy: " + yetAnotherArray[5]);
        // użycie pętli do wypisania wszystkich elementów w tablicy
        //yetAnotherArray.length zwraca jak duża jest tablica

        for (int i = 0; i < yetAnotherArray.length; i++) {
            System.out.println("Element: "+i +" " + yetAnotherArray[i]);
        }


        //możemy stworzyć tablice z dowolnego typu:
        String[] arr = new String[3];
        arr[0] = "Janek"; // dostęp do tablicy po indeksie 1 element
        arr[1] = "Asia"; //2 element
        //arr[2] aktualnie ma wartośc null
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Imie: " + arr[i]);
        }
        //częsty błąd programistów
        //gdy wyjdziemy za zakres tablicy dostaniemy wyjątek: ArrayIndexOutOfBoundsException, program się zakończy
       /* for (int i = 0; i <= arr.length; i++) {
            System.out.println("Imie: "+arr[i]);
        }*/
        int[] array1 = new int[]{3, 5, 5, 2, 1};
        int[] array2 = new int[]{0, 98, 23, 22, 45};
        //trzecią tablicę która będzie miała 10 elementów
        int[] newArray = new int[10];
        int counter = 0;
        int secondArrayCounter = 0;
        int firstArrayCounter = 0;
        do {
            if (counter < 5) {
                newArray[counter] = array1[firstArrayCounter++];
            } else {
                newArray[counter] = array2[secondArrayCounter++];
            }
            counter++;
        } while (counter < newArray.length);

        for (int i =0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }

        //gdy chcemy przejść przez wszystkie elementy możemmy skorzystać z foreach
        // za każdym razem number dostaje kolejny element z tablicy
        for (int number : newArray){
                if (number == 0){
                    continue;
                    //break też dziala
                }
            System.out.println("number "+number);
        }

        String[] strArray = new String[]{"Jasiu","Ania", "Tomek"};
        //String
        for (String str : strArray){
            System.out.println(str);
        }

    }



}
