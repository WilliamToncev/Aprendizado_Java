package ListaDeExercicios;

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        int num1, num2;
        int eMaior;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        num1 = input.nextInt();

        System.out.println("Digite outro numero");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Numeros iguais");
        } else if (num1 > num2) {
            System.out.println("Primeiro é maior");
        } else{
            System.out.println("Segundo é maior");
        }
    }
}
