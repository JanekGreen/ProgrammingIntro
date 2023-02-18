package firstprogram;

public class Car {
    String model;
   //private przed typem pola, chowa to pole dla innych klas
    //to pole jest teraz widoczne tylko w klasie Car
    //producer jest prywatny
    private String producer;

    public Car(){
    }
    public Car(String someModel){
        this.model =someModel;
    }
    //getter metoda, która zwraca na zewnątrz pole z klasy
    //chcemy móc zwrócić producenta, musimy stworzyć do tego metode
    public String getProducer(){
        //zwraca nam na zewnątrz producera
        return producer;
    }
    //setter ustawia wartość pola w klasie zaczyna się od set... (pełna nazwa to jest setNazwaPola które chcemy ustawic)
    public void setProducer(String producer){
        // this oznacza producer z wewnątrz klasy
        this.producer = producer;
    }
}
