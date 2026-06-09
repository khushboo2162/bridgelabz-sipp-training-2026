import java.util.Scanner;

public class Doubleoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("a + (b * c) = " + (a + (b * c)));

        System.out.println("(a + b) * c = " + ((a + b) * c));
    }
}