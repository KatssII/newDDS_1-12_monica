package ProfessorPediu.enumeracoes_5_12;

public class Teste_operacao_enum {
    public static void main(String[] args) {
        OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
        int resultado1 = o1.operacao(5, 3);
        System.out.println("O reusltado é: " + resultado1);
        OperacaoAritimetica o2 = OperacaoAritimetica.SUBTRACAO;
        int resultado2 = o2.operacao(5, 3);
    }
}
