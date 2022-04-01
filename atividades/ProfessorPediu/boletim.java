package ProfessorPediu;

import java.util.Scanner;

public class boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da nota:");
        double valorDaNota = scanner.nextDouble();

        if (valorDaNota > 70 ) {
            System.out.println("Parabeéns, você passou de ano!!!!! ");
        }else if (valorDaNota < 70 ){
            System.out.println("Que peninha, você reprovou;D Nos vemos ano que vem. ");
        }else {
            System.out.println(" ERROR ");
        scanner.close();
        }



    }
}
