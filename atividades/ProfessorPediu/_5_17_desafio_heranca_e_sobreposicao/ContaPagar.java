package ProfessorPediu._5_17_desafio_heranca_e_sobreposicao;

public class ContaPagar  extends Conta {

    private Fornecedor fornecedor;

    public ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Naõ pode pagar uma conta que já está paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que está cancelada: "
            + this.getDescricao() + ".");
        } else {
            System.out.println("Pagando conta" + this.getDescricao() + "no valor de "
            + this.getValor() + " e vencimento em " + this.getDataVencimento()
            + " do fornecedor " + this.getFornecedor().getNome() + ".");
        }
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
