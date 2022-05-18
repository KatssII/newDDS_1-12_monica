package ProfessorPediu._5_17_desafio_heranca_e_sobreposicao._5_18_sobrecarga.exercicio;

import ProfessorPediu._5_17_desafio_heranca_e_sobreposicao._5_18_sobrecarga.Pessoa;

public class MaquinaCafe {
    public void cadastrar(Pessoa pessoa){
        fazerCafe(pessoa.getNome(), pessoa.getIdade(), pessoa.getAcucarDisponivel());
    }

    public void cadastrar(String nome, int idade, Double acucarDisponivel) {
        fazerCafe(nome, idade);
    }

    public void cadastrar(String nome){
        fazerCafe(nome, 0);
    }

    private void fazerCafe(String nome, int idade) {
        System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos." );
    }
}
