package ProfessorPediu.programacao_orientada_a_objetos.Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook XZ10";
        produto.quantidadeEstoque = 8;

        System.out.println("Necessário repor estoque do produto " + produto.nome + " ?" + eNecessarioReporEstoque(produto));
    }

    private static Boolean eNecessarioReporEstoque(Produto produto) {
        return produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;
    }
}
