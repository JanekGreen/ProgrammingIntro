package firstprogram;

public class Arrays {
    public static void main(String[] args) {
        // deklaracja tablicy bez inicjalizacji
        int[] arrDeclaration= new int[10];
        //nie podajemy liczby w nawiasie gdy inicjalizujemy od razu
        int[] yetAnotherArray = new int[]{ 1, 2, 3, 4, 5, 6};
        //możemy stworzyć tablice z dowolnego typu:
        String[] arr = new String[3];
        arr[0] ="Janek"; // dostęp do tablicy po indeksie 1 element
        arr[1]="Asia"; //2 element
        //arr[2] aktualnie ma wartośc null

    }
}
