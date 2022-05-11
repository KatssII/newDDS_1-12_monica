package ProfessorPediu.Orientacao_a_objetos_Pt01.Ex02;

public class Caminhada {
    public void andar(Pessoa pessoa) {
        System.out.println("O(a) " + pessoa.nome + " está passeando com o(a) " + pessoa.cachorro.nome + ".");
    }
}
