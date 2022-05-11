package ProfessorPediu.Orientacao_a_objetos_Pt01.Ex03;

public class Estoque {
    Produto[] produtos;
    void listarProdutos(){
        System.out.println("\nProdutos em estoque");
        System.out.println("---------------------");
        for (int i = 0; i < produtos.length; i++){
            produtos[i].descrever();
        }
    }
}
