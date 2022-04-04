package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro número:" );
        int numero1 = scanner.nextInt();
        System.out.print("Insira o segundo número:" );
        int numero2 = scanner.nextInt();
        System.out.print("Insira o terceiro número:" );
        int numero3 = scanner.nextInt();
        if ((numero1 > numero2 && numero1 > numero3) && (numero2 > numero3)) {
            System.out.println("A ordem de forma decrescente é: " + (numero1 + numero2 + numero3));
        }else if ((numero1 > numero2 && numero1 > numero3) && (numero3 > numero2)) {
            System.out.println("A ordem de forma decrescente é: " + (numero1 + numero3 + numero2));
        }else if
            scanner.close();
        }


    }
}
