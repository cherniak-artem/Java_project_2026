package lab_1;

public class task_1 {

    // Константи
    public static final double A = -1.49;
    public static final double B = 23.4;
    public static final double C = 1.23;
    public static final double D = 2.542;

    // Функція для обчислення y
    public static double calculateY(double a, double b, double c, double d) {
        return Math.sqrt(Math.abs(Math.sin(a) - (4 * Math.log(b)) / Math.pow(c, d))
        );
    }

    public static void main(String[] args) {

        double y = calculateY(A, B, C, D);

        System.out.println("Розв'язок задачі:");
        System.out.println("y = " + y);
    }
}