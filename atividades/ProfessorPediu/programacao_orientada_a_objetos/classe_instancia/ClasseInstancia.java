package ProfessorPediu.programacao_orientada_a_objetos.classe_instancia;

public class ClasseInstancia {
    public static void main(String[] args) {
        System.out.println("Qauntidade mínima de estoque: " + Produto.quantidadeMinimaEstoque);

    Produto produto = new Produto();
        produto.nome = "Caneca";

        Produto produto2 = new Produto();
        produto2.nome = "Carteira";

        Impressao.Informacao("Produto 1: " + produto.nome);
    }
}