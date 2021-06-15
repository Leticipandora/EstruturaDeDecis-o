package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {

        int number;

        Scanner scnnr = new Scanner(System.in);
        System.out.println("digite um número");
        number = scnnr.nextInt();
        if (number > 0 ){
            System.out.println("o número positivo é:");

        } else{
            System.out.println("o número negativo é");
        }
    }
}
