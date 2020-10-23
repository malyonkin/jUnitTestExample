import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //org.junit.runner.JUnitCore.main("funMinTest");

        int a, b, c;
        System.out.println("Введите 3 любых значения для поиска минимума среди них");

        a = new Scanner(System.in).nextInt(); //ввод значений в консоли пользователем
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();

        System.out.println("\nВаше минимальное значение: " + funMin.min(a,b,c));
    }
}
