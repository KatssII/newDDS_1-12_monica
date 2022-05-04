package ProfessorPediu.programacao_orientada_a_objetos.Exercicio03;

public class Pedido {

    String codigo;
    int subTotal;
    int desconto;
    int total;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getTotal() {
        return total = (subTotal - desconto);
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
