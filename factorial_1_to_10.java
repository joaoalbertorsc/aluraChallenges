package alura_challengers;

public class factorial_1_to_10 {
    public static void main(String[] args) {
        int factorial = 1;
        for (int f = 1; f <= 10; f++) {
            factorial *= f;
            System.out.println("factorial of " + f + " = " + factorial);
        }
    }
}
