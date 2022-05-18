package ProfessorPediu._5_17_desafio_heranca_e_sobreposicao._5_18_sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("Murilous", 17);
        cadastroPessoa.cadastrar(pessoa);
        cadastroPessoa.cadastrar("Monica", 17);
    }
}
