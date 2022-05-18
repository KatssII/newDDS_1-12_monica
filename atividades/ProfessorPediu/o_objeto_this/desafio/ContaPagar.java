package ProfessorPediu.o_objeto_this.desafio;

public class ContaPagar {
    public ContaPagar() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }

    private String descricao;
    private Double valor;
    private String dataVencimento;
    Fornecedor fornecedor;


    public ContaPagar(String descricao, Double valor, String dataDeVencimento, Fornecedor fornecedor){
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataDeVencimento;
        this.fornecedor = fornecedor;
    }

    public void pagar(){
        System.out.println("pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "+ this.getDataVencimento() + " do fornrcedor " + this.getFornecedor().getNome() + " .");
    }


}
