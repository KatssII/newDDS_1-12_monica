package ProfessorPediu.programacao_orientada_a_objetos.Exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.codigo = "654321";
        pedido.subTotal = 2500;
        pedido.desconto = 50;
        //pedido.total = "2450";

        System.out.println("O valor do subTotal é de: " + pedido.getSubTotal());
        System.out.println("O valor do desconto é de: " + pedido.getDesconto());
        System.out.println("O total do pedido é de: " + pedido.getTotal());

    }
}
