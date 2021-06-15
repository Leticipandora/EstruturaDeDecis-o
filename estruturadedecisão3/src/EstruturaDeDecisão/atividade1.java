package EstruturaDeDecisão;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        int b1;
        int b2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe dois números:");

        b1 = scanner.nextInt();
        b2 = scanner.nextInt();

        if (b1 > b2) {
            System.out.println("o maior número é: " + b1);

        } else if (b2 > b1) {
            System.out.println("o maior número é:" + b2);

        } else {
            System.out.println("os números são iguais");

        }
    }
}