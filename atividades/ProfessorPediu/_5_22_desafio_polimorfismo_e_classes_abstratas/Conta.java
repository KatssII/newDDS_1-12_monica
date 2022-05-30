package ProfessorPediu._5_22_desafio_polimorfismo_e_classes_abstratas;

public class Conta {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    public Conta() {}


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

    public void exibirListagem(Conta[] contas) {
    }
}
