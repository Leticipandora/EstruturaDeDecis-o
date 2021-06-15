package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade8 {

    public static void main(String[] args) {

        float p1, p2, p3;

        Scanner scnnr = new Scanner(System.in);
        System.out.println(" digite o priemiro número: ");
        p1= scnnr.nextInt();

        System.out.println(" digite o segundo número ");
        p2= scnnr.nextInt();

        System.out.println(" digite o terceiro número ");
        p3= scnnr.nextInt();

        if (p1 < p2 && p1 < p3){
            System.out.println(" o item selecionado " + p1 + " é o produto mais barato. ");

        }else if (p2 < p1 && p2 < p3){
            System.out.println(" o item selecionado " + p2 + " é o produto mais barato. ");

        }else if (p3 < p1 && p3 < p2){
            System.out.println(" o item selecionado " + p3 + " é o produto mais barato ");

        }else{
            System.out.println(" os valores selecionados são iguais ");
        }



    }
}