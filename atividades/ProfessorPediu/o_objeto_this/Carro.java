package ProfessorPediu.o_objeto_this;

import ProfessorPediu.Orientacao_a_objetos_Pt01.Composicao_de_objetos.Proprietario;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alterarModelo(String modelo){
        if (modelo != null){
            this.modelo = modelo;
        }
    }
}
