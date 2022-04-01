package ProfessorPediu;

import java.io.StringWriter;
import java.util.Scanner;

public class olamundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.print("qual o seu sobrenome? ");
        String sobrenome = scanner.nextLine();
        System.out.print("Seu nome e: " + nome + " " + sobrenome);
        scanner.close();
    }
}