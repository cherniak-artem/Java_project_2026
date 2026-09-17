package lab_1;

public class task_3 {

    // Константи
    public static final double A = -2.54;
    public static final double B = 1.23;
    public static final double C = -2.14;
    public static final double D = -0.23;

    // Функція для обчислення y
    public static double calculateY() {
        return 3 * (Math.log(Math.abs(A / B)) + Math.sqrt(Math.cos(C) + Math.exp(D))
        );
    }

    public static void main(String[] args) {

        double y = calculateY();

        System.out.printf("y = %.4f%n", y);
    }
}