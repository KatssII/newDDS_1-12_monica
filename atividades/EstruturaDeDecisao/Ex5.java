package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ditite a primeira nota: ");
        Double nota1 = scanner.nextDouble();
        System.out.print("Ditite a segunda nota: ");
        Double nota2 = scanner.nextDouble();
        double mediaDaNota =  ((nota1 + nota2) / 2);
        if (mediaDaNota > 7) {
            System.out.println(("Sua nota foi ") + mediaDaNota + (", você foi aprovado. "));
        } else if (mediaDaNota < 7) {
            System.out.println(("Sua nota foi") + mediaDaNota + (",você foi reprovado. "));
        } else if (mediaDaNota >= 10){

            System.out.println(("Sua nota foi") + mediaDaNota + (", você foi a'provado com Distinção. "));

            System.out.println(("Sua nota foi") + mediaDaNota + (", você foi aprovado com Distinção. "));

            scanner.close();
        }

    }
}
