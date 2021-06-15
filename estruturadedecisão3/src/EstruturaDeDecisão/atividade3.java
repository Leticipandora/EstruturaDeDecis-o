package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        System.out.println("informe o seu gênero:");
        Scanner scnnr = new Scanner (System.in);
        char gênero = scnnr.next().charAt(0);
        if (gênero == 'm' || gênero == 'M') {
            System.out.println("masculino");

        } else if (gênero == 'f' || gênero == 'F') {
            System.out.println("feminino");


        } else {
            System.out.println("sexo inválido");
        }


    }
}
