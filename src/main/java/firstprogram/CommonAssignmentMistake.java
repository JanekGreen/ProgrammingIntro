package firstprogram;

public class CommonAssignmentMistake {
    public static void main(String[] args) {
        boolean hungry = false;
        // spójna konwencja gdzie ustawiać nawiasy:
        //sprawdzenie warunku logicznego
        //w przypadku użycia = (operatora przypisania)
        //-majpierw do zmiennej hungry zostanie przypisane true,
        // następnie zostanie wykonane sprawdzenie warunku
        //warunek zawsze będzie spełnony

        if (hungry = true) {
            System.out.println("Muszę coś zjeść");
            System.out.println("Idę do lodówki");
        } else {
            System.out.println("Nie chce mi się jeść");
        }
    }
}
