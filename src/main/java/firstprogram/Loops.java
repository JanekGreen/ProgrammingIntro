package firstprogram;

public class Loops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0; i<5;i++){
            sum+=i;
        }
        //5 silnia
        //5! 1*2*3*4*5
        System.out.println("Suma "+sum);

        //i to zmienna tymczasowa licznik
        // i=0; - stan na początku pętli
        //i<10; dopóki warunek jest spełniony pętla będzie wykonywana
        //i++ zmiana wartości na końcu każdej iteracji
      /*  for (int i = 1; i <= 10; i++) {
            System.out.println("wartość i: " + i);
        }
        //można modyfikować licznik dowolnie, nie musi to być inkrementacja.
        //tutaj idziemy co 2
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("wartość i: " + i);
        }
        //pętla nieskończona, duże bubu
        for (int i = 1; i <= 10; i = 2) {
            System.out.println("wartość i: " + i);

        }*/

        //pytanie, jak odwórócić pętle
        //pętla while, gdy nie wiemy ile razy trzeba wykonać jakąś czynność
        int i = 0;
        while (i<10){
           //sami musimy dbać o licznik,
            System.out.println(i);
            i++;
        }
        System.out.println("wartość i: "+i);
        i=0;
        // różnica  pomiędzy pętlą while jest taka, że pętla do while wykona się conajmniej raz

        System.out.println("wartość i: " + i);

        do {
            System.out.println("Początek");
            System.out.println("nie "+i--);
        } while (i > 0);

    }
}
