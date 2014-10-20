/**
 * Created by student on 20.10.2014.
 */
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первый коэффициент уравнения: ");
        double a = sc.nextDouble();
        System.out.print("Введите второй коэффициент уравнения: ");
        double b = sc.nextDouble();
        System.out.print("Введите третий коэффициент уравнения: ");
        double c = sc.nextDouble();
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        double x1, x2, d = b * b - 4 * a * c;
        if (d < 0) System.out.println("Вещественных корней нет");
        else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x1 == x2) System.out.println("x = " + x1);
            else System.out.println("x1 = " + x1 + "; x2 = " + x2);
        }

    }
}
