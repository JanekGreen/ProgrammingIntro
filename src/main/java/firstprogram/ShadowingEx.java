package firstprogram;

//przysłanianie - zmienna zadeklarowana w lokalnie "przysłania" zmienną zadeklarowaną lokalnie
public class ShadowingEx {
    static int age;
    public static void main(String[] args) {
      age = 2;
      int age =3;
        System.out.println(age);
    }
}
