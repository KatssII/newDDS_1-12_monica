package ProfessorPediu;

import java.util.Scanner;

public class Recursividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avançado"};
        imprimir("escolha dentre os cursos abaixo: ");
        InterarEExibirPosicoesVetorString(cursos);
    }
    private static void InterarEExibirPosicoesVetorString(String[]cursos) {
    }

    private static void imprimirTraco() {
        imprimir("-------------------------------------");
    }

    private static void imprimir(String texto) {
        System.out.println();
    }
}
