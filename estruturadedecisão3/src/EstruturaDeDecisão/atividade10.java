package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade10 {


        public static void main(String[] args) {

        Scanner scnrr = new Scanner(System.in);
        System.out.println("Digite M para matutino, V para vespertino ou N para noturno");

         String turno = scnrr.next();

        if ("m" .equalsIgnoreCase(turno)) {
                System.out.println("Bom dia matutino");

        }else if ("v" .equalsIgnoreCase(turno)) {
                System.out.println("boa tarde vespertino");

        }else if ("n" .equalsIgnoreCase(turno)){
                System.out.println("boa noite noturno");

        }else{
                System.out.println("turno inválido.");
        }
}

}