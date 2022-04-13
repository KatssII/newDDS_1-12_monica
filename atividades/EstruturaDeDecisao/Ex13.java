package EstruturaDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class Ex13  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ente com um número de 1 a 7: ");
        int diaDaSemana = scanner.nextInt();
        if (Objects.equals(diaDaSemana, "1")) {
            System.out.println("O dia correnpondênte ao númro digitado é domingo. ");
        }else if (Objects.equals(diaDaSemana, "2")) {
            System.out.println("O dia correnpondênte ao númro digitado é seguna-feira. ");
        }else if (Objects.equals(diaDaSemana, "3")) {
            System.out.println("O dia correnpondênte ao númro digitado é terça-feira. ");
        }else if (Objects.equals(diaDaSemana, "4")) {
            System.out.println("O dia correnpondênte ao númro digitado é quarta-feira. ");
        }else if (Objects.equals(diaDaSemana, "5")) {
            System.out.println("O dia correnpondênte ao númro digitado é quinta-feira. ");
        }else if (Objects.equals(diaDaSemana, "6")) {
            System.out.println("O dia correnpondênte ao númro digitado é sexta-feira. ");
        }else if (Objects.equals(diaDaSemana, "7")) {
            System.out.println("O dia correnpondênte ao númro digitado é sabádo. ");
            scanner.close();
        }
    }
}
