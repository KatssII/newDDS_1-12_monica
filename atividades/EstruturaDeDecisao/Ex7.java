package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro número:" );
        int numero1 = scanner.nextInt();
        System.out.print("Insira o segundo número:" );
        int numero2 = scanner.nextInt();
        System.out.print("Insira o terceiro número:" );
        int numero3 = scanner.nextInt();
        if ((numero1 < numero3) && (numero1 < numero2 )) {
            System.out.println("O número " + numero1 + " é menor que os outros dois. ");
        }else if ((numero2 < numero1) && (numero2 < numero3)) {
            System.out.println("O número " + numero2 + " é menor que os outros dois. ");
        }else if ((numero3 < numero1) && (numero3 < numero2)) {
            System.out.println("O número " + numero3 + " é menor que os outros dois.");
            scanner.close();
        }
    }
}
