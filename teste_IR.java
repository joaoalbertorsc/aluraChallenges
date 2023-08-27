package alura_challengers;

import java.util.Scanner;

public class teste_IR {
        public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)){

                System.out.print("Enter your salary: ");

                String input = scanner.nextLine();

                System.out.println("User salary is: " + input);

                double salario = Double.valueOf(input);
                if (salario >= 1900 && salario <= 2800) {
                    double ir = 142;
                    double salarioFinal = salario - ir;
                    System.out.println("Final salary is = " + salarioFinal);
                } else {
                    System.out.println("IR of 7.5% doesn't match with this salary");
                }

                if (salario >= 2800.01 && salario <= 3751) {
                    double ir = 350;
                    double salarioFinal = salario - ir;
                    System.out.println("Final salary is = " + salarioFinal);
                } else {
                    System.out.println("IR of 15% doesn't match with this salary.");
                }

                if (salario >= 3751.01 && salario <= 4664) {
                    double ir = 636;
                    double salarioFinal = salario - ir;
                    System.out.println("Final salary is = " + salarioFinal);
                } else {
                    System.out.println("IR of 22.5% doesn't match with this salary.");
                }
            }

        }
}
