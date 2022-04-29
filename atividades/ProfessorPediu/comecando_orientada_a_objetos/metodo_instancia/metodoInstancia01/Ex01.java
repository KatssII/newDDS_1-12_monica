package ProfessorPediu.comecando_orientada_a_objetos.metodo_instancia.metodoInstancia01;

public class Ex01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.quantidade = 9;

        exibirQuantidadeEmEstoque(produto);
    }

    private static void exibirQuantidadeEmEstoque(Produto produto) {
        Boolean precisaReporEstoque  = produto.quantidade <10;
        if (precisaReporEstoque){
            System.out.print("Necessário a reposição do estoque. ");
        }else {
            System.out.print("Não é necessário reabaster o estoque. ");
        }

    }
}
