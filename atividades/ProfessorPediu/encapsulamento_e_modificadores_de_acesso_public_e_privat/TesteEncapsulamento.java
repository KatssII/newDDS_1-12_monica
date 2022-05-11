package ProfessorPediu.encapsulamento_e_modificadores_de_acesso_public_e_privat;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("temperatura do ar: " + ar.obterTemperatura() + "°");
        ar.trocarTemperatura(10);
        System.out.println("temperatura do ar: " + ar.obterTemperatura() + "°");
    }
}
