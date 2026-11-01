package lab_2;

public class task_3 {

    public static void main(String[] args) {

        printResults(0.1);
        printResults(0.01);
        printResults(0.001);
        printResults(0.0001);
        printResults(1.0);
        printResults(0.5);
        printResults(0);
        printResults(-0.01);
        printResults(Double.NaN);
    }

    //Обчислення нескінченниого ряду із заданою точністю
    public static double calculate(double epsilon) {

        //Перевірка введених параметрів
        if (!Double.isFinite(epsilon) || epsilon <= 0) {
            throw new IllegalArgumentException(
                    "epsilon must be greater than 0 and finite"
            );
        }

        double sum = 0;
        int i = 1;

        //Обчислення ряду, доки не буде досягнуто необхідної точності
        while (true) {

            double term = Math.pow(-1, i + 1) /
                    ((double) (i + 1) * (i + 2));

            //Перевірка умови точності
            if (Math.abs(term) < epsilon) {
                break;
            }

            sum += term;

            i++;
        }

        return sum;
    }

    //Виведення результатів
    static void printResults(double epsilon) {

        System.out.print("epsilon: " + epsilon + " result: ");

        try {
            System.out.println(calculate(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
