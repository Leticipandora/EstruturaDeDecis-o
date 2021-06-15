package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade5 {

    public static void main(String[] args) {

        Scanner scnnr = new Scanner(System.in);

        double media;
        double nota1;
        double nota2;

        System.out.println("digite a primeira nota");
        nota1 = scnnr.nextInt();

        System.out.println("digite a segunda nota");
        nota2 = scnnr.nextInt();

        media = (nota1 + nota2) / 2 ;

        if (media == 10 ) {
            System.out.println("parabéns você foi aprovado com distinção");

        } else if (media < 7 ) {
            System.out.println("infelizmente você foi reprovado");

        } else if (media >= 7) {
            System.out.println("parabéns você foi aprovado");
            }
        





    }

}

