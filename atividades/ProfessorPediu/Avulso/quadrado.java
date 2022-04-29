package ProfessorPediu.Avulso;

import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" digite o numero1 ");
        Double numero1 = scanner.nextDouble();
        System.out.print( "Seu numero ao quadrado e: " + numero1 * numero1 );
        scanner.close();
}
}
