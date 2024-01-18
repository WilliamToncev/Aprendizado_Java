package ListaDeExercicios;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        int v1, v2;
        int multiplos;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        v1 = input.nextInt();

        System.out.println("Digite outro valor: ");
        v2 = input.nextInt();

        if (saoMultiplos(v1, v2)) {
            System.out.println("São multiplos");
        }else {
            System.out.println("Não são multiplos");
        }
    }
    private static boolean saoMultiplos(int v1, int v2){
        return (v1 % v2 == 0) || (v2 % v1 == 0);
    }
}
