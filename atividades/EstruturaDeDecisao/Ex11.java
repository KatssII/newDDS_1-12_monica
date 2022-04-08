package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor do seu salário: ");
        int valorAntesReajuste = scanner.nextInt();

        int salarioAte280 = 280;
        double salarioAumentado280 = 0.20;
        int salarioAte700 = 700;
        double salarioAumentado700 = 0.15;
        int salarioAte1500 = 1500;
        double salarioAumentado1500 = 0.10;
        double salarioApos1500 = 0.5;

        if (valorAntesReajuste <=280) {
            int salarioDepoisReajuste = (int) (valorAntesReajuste + (valorAntesReajuste * salarioAumentado280));
            System.out.println("O seu salário antes do reajuste, era de " + valorAntesReajuste);
            System.out.println("O percentual, do aumento aplicado, foi de " + salarioAumentado280 + " %");
            System.out.println("O valor do aumento do seu salário foi de " + (salarioDepoisReajuste - salarioAte280));
            System.out.println("O valor do seu novo salário é de " + salarioDepoisReajuste + " reais.");

        }else  if ((valorAntesReajuste >280) && (valorAntesReajuste <=700));

        scanner.close();
    }
}
