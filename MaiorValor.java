package ListaDeExercicios;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {

        double a, b, c;
        double maiorValor;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        a= input.nextDouble();

        System.out.println("Digite o valor de B");
        b= input.nextDouble();

        System.out.println("Digite o valor de C");
        c= input.nextDouble();

        maiorValor = encontraMaiorValor(a, b, c);

        System.out.println(maiorValor + ", é o maior");
    }

    private static double encontraMaiorValor(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
