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

        //j to zmienna tymczasowa licznik
        // j=0; - stan na początku pętli
        //j<10; dopóki warunek jest spełniony pętla będzie wykonywana
        //j++ zmiana wartości na końcu każdej iteracji
      /*  for (int j = 1; j <= 10; j++) {
            System.out.println("wartość j: " + j);
        }
        //można modyfikować licznik dowolnie, nie musi to być inkrementacja.
        //tutaj idziemy co 2
        for (int j = 1; j <= 10; j += 2) {
            System.out.println("wartość j: " + j);
        }
        //pętla nieskończona, duże bubu
        for (int j = 1; j <= 10; j = 2) {
            System.out.println("wartość j: " + j);

        }*/

        //pytanie, jak odwórócić pętle
        //pętla while, gdy nie wiemy ile razy trzeba wykonać jakąś czynność
        int j = 0;
        while (j<10){
           //sami musimy dbać o licznik,
            System.out.println(j);
            j++;
        }
        System.out.println("wartość j: "+j);
        j=0;
        // różnica  pomiędzy pętlą while jest taka, że pętla do while wykona się conajmniej raz

        System.out.println("wartość j: " + j);

        do {
            System.out.println("Początek");
            System.out.println("nie "+j--);
        } while (j > 0);

        // instrukcje break i continue
        for (int k=0; k<5;k++){
            if(k == 1 || k==2){
                // gdy licznik osiągnie 1 lub 2 przejdziemy do następnej iteracji, pomijamy 1 i 2
                continue;
            }
            System.out.println(k);
        }
        System.out.println("break");
        for (int k=0; k<5;k++){
            if(k == 1){
                // gdy licznik osiągnie 1 wychodzimy z pętli całkowicie nie robimy więcej iteracji
                break;
            }
            System.out.println(k);
        }

    }
}
