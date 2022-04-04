package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        float numero1 = scanner.nextFloat();
        System.out.println("Insira o segundo número: ");
        float numero2 = scanner.nextFloat();
        if (numero1 > numero2) {
            System.out.print("O numero " + numero1 + " é maior que o número " + numero2);
        }else if (numero2 > numero1)
            System.out.print("O múmero " + numero2 + " é maior que o número " + numero1);
        scanner.close();
    }
}
