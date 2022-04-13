package EstruturaDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class Ex13  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ente com um número de 1 a 7: ");
        int diaDaSemana = scanner.nextInt();
        switch (diaDaSemana) {
            case 1:
             System.out.println("O dia da semana é domingo. ");
             break;
            case 2:
                System.out.println("O dia da semana é segunda-feira. ");
             break;
            case 3:
                System.out.println("O dia da semana é terça-feira. ");
             break;
            case 4:
                System.out.println("O dia da semana é quarta-feira. ");
             break;
            case 5:
                System.out.println("O dia da semana é quinta-feira. ");
             break;
            case 6:
                System.out.println("O dia da semana é sexta-feira. ");
             break;
            case 7:
                System.out.println("O dia da semana é sabádo. ");
                scanner.close();
        }
    }
}
