package EstruturaDeDecisao;

import java.util.Scanner;

public class  Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira  a sua idêntidade de gênero: ");
        String genero = scanner.nextLine();
        String f = "f";
        String m = "m";
        if (genero.equals(f)) {
            System.out.println("O seu gênero é o feminino. ");
        }else if (genero.equals(m)){
            System.out.println("O seu gênero é o masculino. ");
        }else
            System.out.println("O seu gênero é inválido. ");
        scanner.close();
    }
}

