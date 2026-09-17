package lab_1;

public class task_2 {

    // Константи
    public static final double A = 0.478;
    public static final double B = -1.26;
    public static final double C = 2.68;
    public static final double D = 18.24;

    // Константа формули
    public static final double NUMBER = 2.43;

    // Функція для обчислення y
    public static double calculateY() {
        return 9 * Math.asin(A) / Math.cos(Math.sqrt(Math.abs(B))) + Math.pow(NUMBER, D) + Math.log(C);
    }

    public static void main(String[] args) {

        double y = calculateY();

        System.out.println("Розв'язок задачі:");
        System.out.printf("y = %.2f%n", y);
    }
}