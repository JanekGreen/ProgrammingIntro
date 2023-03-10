package firstprogram;

//stworzyłem klase, taki przepis na własny typ,która ma pola i metody
public class Human {
    //pola to są dane które klasa posiada. zwykłe zmienne bądź stałe
    String name;
    int age;

    //konstruktor - specjalna metoda do Tworzenia obiektu
    // posiada zawsze taką nazwe jak klasa
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(String name) {
        this.name = name;
    }
    //konstruktor bezparametrowy, nie ustawiamy wartości żadnego pola
    public Human() {
    }
    // przykład metody, akcja, którą można wykonać na obiekcie
    //nazwę
    //typ zwracany void
    //modyfikator, public
    //
    public void introduceYourself(){
        System.out.println("Cześć, jestem "+name);
    }
    //typ zwracany int
    public int doubleAge(){
        return age*2;
    }
    //some name to parametr - zmienna, którą możemy przyjąć z zewnątrz
    public void greetSomeone(String someName){
        System.out.println("Czesc "+ someName+" jestem "+name );
    }
}
