package ProfessorPediu.modificador_de_acesso_default_5_9;

public class principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Toddy");
        DonoCachorro donoCachorro = new DonoCachorro();
        donoCachorro.ensinarCachorroSentar(cachorro);
    }
}
