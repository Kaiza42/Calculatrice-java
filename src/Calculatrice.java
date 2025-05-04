import java.util.Scanner;

public class Calculatrice {
    public double Addition(double x, double y) {
        return x + y;
    }
     public double Subtraction(double x, double y) {
        return x - y;
     }
     public double Multiplication(double x, double y) {
        return x * y;
     }
     public double Division(double x, double y) {
        if (y == 0 || x == 0) {
            System.out.println("on ne divise pas par 0.");
            return 0;
        }
        return x / y;
     }
}
