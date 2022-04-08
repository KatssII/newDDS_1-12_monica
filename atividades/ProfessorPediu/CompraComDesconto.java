package ProfessorPediu;

import java.util.Scanner;

public class CompraComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROMOÇÃO");
        System.out.println("Acima de 10 produtos, é colocado uma taxa de desconto em cima do produto ");
        System.out.print("Por favor insira  o valor do produto: ");
        float valorDoProduto = scanner.nextFloat();
        System.out.print("Por favor entre com a quantidade de produtos: ");
        float quantidadeDeProduto = scanner.nextFloat();

    }
}
