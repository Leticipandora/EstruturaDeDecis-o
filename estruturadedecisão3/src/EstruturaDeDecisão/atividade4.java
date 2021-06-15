package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {
        Scanner scnnr = new Scanner(System.in);
        System.out.println("informe uma letra");

        String letra = scnnr.next();
        switch (letra) {

            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println("a letra " + letra + " é uma vogal" );
             break;
            default:

                System.out.println("a letra " + letra + " é uma consoante");


        }
    }
}









