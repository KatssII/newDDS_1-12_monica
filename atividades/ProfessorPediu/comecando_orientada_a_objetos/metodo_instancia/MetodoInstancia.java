package ProfessorPediu.comecando_orientada_a_objetos.metodo_instancia;

public class MetodoInstancia {

    public static void main(String[] args) {
         Cliente cliente = new Cliente();
         cliente.primeiroNome = "MUrilo";
         cliente.ultimoNome = "Rossi";
         cliente.telefone = "27999006666";
         cliente.email = "muruli.trouxa@hot";

         Cliente cliente2 = new Cliente();
         cliente.primeiroNome = "Monicous";
         cliente.ultimoNome = "Siepierski";
         cliente.telefone = "27999999999";

         System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD " + cliente.obterDDD());
    }
}
