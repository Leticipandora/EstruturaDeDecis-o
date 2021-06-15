package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade7 {

    public static void main(String[] args) {

        int n1,n2,n3;
        Scanner scnnr = new Scanner (System.in);
        System.out.println("digite o primeiro número");
        n1= scnnr.nextInt();

        System.out.println("digite o segundo número ");
        n2= scnnr.nextInt();

        System.out.println("digite o terceiro número");
        n3= scnnr.nextInt();


        if (n1 < n2 && n1 < n3){
            System.out.println("o número " + n1 + " é o menor número");

        } else if (n2 < n1 && n2 < n3){
            System.out.println("o número " + n2 + " é o menor número ");

        }else if (n3 < n1 && n3 < n2){
            System.out.println("o número " + n3 + " é o menor número");

            if (n1 > n2 && n1 > n3){
                System.out.println("o número " + n1 + " é o maior número");

            }else if (n2 > n1 && n2 > n3){
                System.out.println("o número " + n2 + " é o maior número" );

            }else if (n3 > n1 && n3 > n2){
                System.out.println("o número " + n3 + "  é o maior número");
            }

        }else{
            System.out.println("os números são iguais");
        }

    }
}
