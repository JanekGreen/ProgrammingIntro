package firstprogram;

public class Scopes {

    public static void main(String[] args) {
        int a = 1;
        {
            a = 10; // możemy wykorzystywać zmienną z zewnętrznego bloku
            int b = 20; // możemy wykorzystywać zmienną z obecnego bloku
            if (a == 10) {
                a = 100; b = 200;
                int c = 300;
            }
            System.out.println(a); // wyświetli 100
            System.out.println(b); // wyświetli 300
            //System.out.println(c); // błąd kompilacji; nie można używać zmiennej z wewnętrznego bloku
        }
    }
}
