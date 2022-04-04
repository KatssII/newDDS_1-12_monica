package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor do primeiro produto:" );
        Double produto1 = scanner.nextDouble();
        System.out.print("Insira o valor do segundo produto:" );
        Double produto2 = scanner.nextDouble();
        System.out.print("Insira o valor do terceiro produto:" );
        Double produto3 = scanner.nextDouble();
        if ((produto1 < produto3) && (produto1 < produto2 )) {
            System.out.println("O produto com menor preço, e mais aconcelhavel a comprar, é o " + produto1 );
        }else if ((produto2 < produto1) && (produto2 < produto3)) {
            System.out.println("O produto com menor preço, e mais aconcelhavel a comprar, é o " + produto2 );
        }else if ((produto3 < produto1) && (produto3 < produto2)) {
            System.out.println("O produto com menor preço, e mais aconcelhavel a comprar, é o " + produto3 );
            scanner.close();
        }
    }
}
