package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o turno que você estuda: ");
        String turno = scanner.nextLine();
        Boolean turnoMatutino = turno.equals("M") || turno.equals("m");
        Boolean turnoVespertino = turno.equals("V") || turno.equals("v");
        Boolean turnoNoturno = turno.equals("N") || turno.equals("n");
        if (turnoMatutino) {
            System.out.println("Seu turno é o matutino, tenha um bom dia:D ");
        } else if (turnoVespertino){
            System.out.println("Seu turno é o vespertino, tenha uma boa tarde:) ");
    } else
            System.out.println("Seu turno é o noturno, tenha uma boa noite:3 ");
        scanner.close();
        }
    }




