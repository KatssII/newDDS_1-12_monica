package ProfessorPediu;

import java.util.Scanner;

public class ReceberNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite a sua nota: ");
        Double notaDoAluno = scanner.nextDouble();

        Boolean passouDeAno = notaDoAluno >= 70;


        if (passouDeAno) {
            System.out.println(" Parabéns! Você passou de ano. ");

        } else {
            System.out.println(" ,ficou de recuperação. ");
        }
        scanner.close();

    }
}