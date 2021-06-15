package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade6 {

    public static void main(String[] args) {

        Scanner scnnr = new Scanner (System.in);

       double n1, n2, n3;

        System.out.println("digite o primeiro número: ");
        n1 = scnnr.nextDouble();

        System.out.println("digite o segundo número:" );
        n2 = scnnr.nextDouble();

        System.out.println("digite o terceiro número: ");
        n3 = scnnr.nextDouble();

        if (n1 > n2 && n1 > n3 ) {
            System.out.println("o número "    + n1 + " é o maior número");

        } else if (n2 > n1 && n2 > n3 ) {
            System.out.println("o número "     + n2 + " é o maior número");

        }else if (n3 > n1 && n3 > n2 ) {
            System.out.println("o número " + n3 + " é o maior número");

        }else{
            System.out.println("os números são iguais.");

            }
        }


}
