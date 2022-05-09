package ProfessorPediu.Orientacao_a_objetos.Ex01;

public class PetShop {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Toddy";
        cachorro1.raca = "Basset";
        cachorro1.sexo = "Masculino";
        cachorro1.idade = 9;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Collie";
        cachorro2.raca = "Caramelo";
        cachorro2.sexo = "Fêminino";
        cachorro2.idade = 1;

        ExibirFichaDoCachorro1(cachorro1);
        ExibirFichaDoCachorro2(cachorro2);

    }

    private static void ExibirFichaDoCachorro1(Cachorro cachorro1) {
        imprimirTraco();
        System.out.println("A ficha completa do 1° doguinho é: " );
        System.out.println("Nome: " + cachorro1.nome + " \n" + "Raça: " + cachorro1.raca + " \n" + "Sexo: " + cachorro1.sexo + " \n" + "Idade: " + cachorro1.idade);
        imprimirTraco();
    }
    private  static void ExibirFichaDoCachorro2(Cachorro cachorro2) {
        System.out.println("A ficha completa do 2° doguinho é: " );
        System.out.println("Nome: " + cachorro2.nome + " \n" + "Raça: " + cachorro2.raca + " \n" + "Sexo: " + cachorro2.sexo + " \n" + "Idade: " + cachorro2.idade);
        imprimirTraco();
    }
    static void  imprimirTraco() {
        System.out.println("------------------------------------");
    }
}