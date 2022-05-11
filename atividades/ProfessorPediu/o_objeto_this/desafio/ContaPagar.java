package ProfessorPediu.o_objeto_this.desafio;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataDeVencimento;
    private String fornecedor;

    public ContaPagar(){

    }

    public ContaPagar(String descricao, int valor, String dataDeVencimento, String fornecedor){
        this.descricao = "Mercado";
        this.valor = 345;
        this.dataDeVencimento = "27/12/2022";
        this.fornecedor = "murilous";
    }


}
