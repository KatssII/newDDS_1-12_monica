package ProfessorPediu.Orientacao_a_objetos_Pt01.Ex02;

public class Passeio {
    public static void main(String[] args) {
        Pessoa dono = new Pessoa();
        dono.nome = "Alberto";
        dono.idade = 56;
        dono.cachorro = new Cachorro();
        dono.cachorro.nome = "Mel";
        dono.cachorro.sexo = "Feminino";
        dono.cachorro.raca = "Golden Retriver";
        dono.cachorro.idade = 3;
        Caminhada caminhada = new Caminhada();
        caminhada.andar(dono);
    }
}
