package ProfessorPediu.Orientacao_a_objetos_Pt01.Composicao_de_objetos;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.modelo = "Palio";
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "João";
        meuCarro.dono.bairro = "Centro";
    }
}
