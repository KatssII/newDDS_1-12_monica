package ProfessorPediu.Avulso;

import java.util.Scanner;

public class NomeSobrenome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu primeiro nome: ");
        String primeiroNome = scanner.nextLine();
        System.out.print("por favor, digite o seu sobrenome: ");
        String segundoNome = scanner.nextLine();
        System.out.print("O seu nome compreto é: " + primeiroNome + " " + segundoNome);
        scanner.close();
    }
}

