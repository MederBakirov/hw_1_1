import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String helloWorld;
        final int NUM =1488 ;
        String word = "Aleksey";
        helloWorld = NUM + word;
        System.out.println(helloWorld);

    if (NUM < 0) {
        System.out.println("Вы сохранили отрицательное число");
    } else if (NUM > 0) {
        System.out.println("Вы сохранили положительное число");
    }else {
        System.out.println("Вы сохранили ноль");
    }
    }
}