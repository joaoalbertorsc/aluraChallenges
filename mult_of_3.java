package alura_challengers;

public class mult_of_3 {
    public static void main(String[] args) {

        for (int number = 1; number < 101; number++) {
            if (number % 3 == 0) {
                System.out.println(number + " is mult of 3");
            }
        }
    }
}
