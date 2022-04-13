package ProfessorPediu;

import java.util.Scanner;

public class boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da nota:");
        double valorDaNota = scanner.nextDouble();

        Boolean valordaNota = valorDaNota >= 70;

        if (valordaNota) {
            System.out.println("Parabeéns, você passou de ano!!!!! ");
        }else {
            System.out.println("Que peninha, você reprovou;D Nos vemos no ano que vem. ");
        scanner.close();
        }



    }
}
