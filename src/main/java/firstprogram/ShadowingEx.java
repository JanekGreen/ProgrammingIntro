package firstprogram;

//przysłanianie - zmienna zadeklarowana w lokalnie "przysłania" zmienną zadeklarowaną lokalnie
public class ShadowingEx {
    // można tworzyć zmienne bezpośrednio po nazwie klasy
    //takie zmienne nazywają się zmiennymi globalnymi
    //tworząc zmienną tutaj, ona jest widoczna w całej metodzie main i w całej klasie
    static int age; // globalna zmienna age

    public static void main(String[] args) {
        age = 2; // zmienne tworzone wewnątrz metod to są zmienne lokalne

        int age = 3;
        //można stworzyć zmienną lokalną wewnątrz bloku, która będzie nazywała się tak samo jak
        //zmienna globalna. W takiej sytuacji posługując sie nazwą tej zmiennej, wewnątrz tego bloku
        // będziemy mieli wartość zmiennej lokalnej // shadowing - przesłanianie
        // zostanie wypisane 3
        System.out.println(age);
    }

    public static void myMethod(String[] args) {
        age = 2;
        int age = 3;
        System.out.println(age);
    }
}
