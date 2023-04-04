package Laboration1;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / (double) b;
    }

    public double squareRootOf(int a) {
        return Math.sqrt(a);
    }

    public double getArea(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double area = Math.PI * (a * a);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getCircumference(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double circumference = Math.PI * 2 * a;
        return Math.round(circumference * 100.0) / 100.0;
    }
}