package ProfessorPediu.programacao_orientada_a_objetos.Exercicio02;

public class Produto {
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
    String nome;
    Integer quantidadeEstoque;

    public Boolean eNecessarioReporEstoque() {
        return quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;
    }
}
