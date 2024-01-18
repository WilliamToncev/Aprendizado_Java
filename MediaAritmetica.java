package ListaDeExercicios;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {

        double nota1, nota2, nota3;
        double mediaAritmetica;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota 1");
        nota1= input.nextDouble();

        System.out.println("Informe a nota 2");
        nota2= input.nextDouble();

        System.out.println("Informe a nota 3");
        nota3= input.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        if ( mediaAritmetica >= 6) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        System.out.println("Media:" + mediaAritmetica);

        input.close();
    }
}
