package firstprogram;

public class Ifstatements {
    public static void main(String[] args) {
/*        boolean hungry = true;
        // spójna konwencja gdzie ustawiać nawiasy:
        if (hungry == true) {
            System.out.println("Muszę coś zjeść");
            System.out.println("Idę do lodówki");
        } else {
            System.out.println("Nie chce mi się jeść");
        }

        //jeżeli mamy jedną linię do wykonania możemy usunąć nawiasy
        if (hungry == true)
            System.out.println("Muszę coś zjeść");
        else
            System.out.println("Nie chce mi się jeść");*/

        int number = 17;
        // nie mamy kodu który chcemy wykonać dla liczb dodatnich:
        if(number< 0){
            System.out.println("Ujemna");
        }else if(number == 0){
            System.out.println(" zero");
        }

        // nie mamy kodu który chcemy wykonać dla liczb dodatnich:
        if(number< 0){
            System.out.println("Ujemna");
        }else if(number == 0){
            System.out.println(" zero");
        }else {
            System.out.println("Liczba dodatnia");
            //ten blok zostanie wykonany dla każdej wartości, która nie pasuje do warunków wyzej.
        }

        // możemy mieć dowolną ilość else if
        if(number< 0){
            System.out.println("Ujemna");
        }else if(number == 0){
            System.out.println(" zero");

        }else if (number >0 && number<=50) {
            System.out.println("od 1 do 50");
            //ten blok zostanie wykonany dla każdej wartości, która nie pasuje do warunków wyzej.
        }else {
            System.out.println("Liczba dodatnia");
        }/*else { // możemy mieć tylko jeden else

        }*/
    }
}
