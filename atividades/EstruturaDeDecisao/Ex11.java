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
        double salarioApos1500 = 0.05;

        if (valorAntesReajuste <=280) {
            double salarioDepoisReajuste = (valorAntesReajuste + (valorAntesReajuste * salarioAumentado280));
            System.out.println("O seu salário antes do reajuste, era de " + valorAntesReajuste + " reais. ");
            System.out.println("O percentual, do aumento aplicado, foi de 20%. ");
            System.out.println("O valor do aumento do seu salário foi de " + (salarioDepoisReajuste - valorAntesReajuste) + " reais. ");
            System.out.println("O valor do seu novo salário é de " + salarioDepoisReajuste + " reais.");

        }else  if ((valorAntesReajuste >=280) && (valorAntesReajuste <700)) {
            double salarioDepoisReajuste = (valorAntesReajuste + (valorAntesReajuste * salarioAumentado700));
            System.out.println("O seu salário antes do reajuste, era de " + valorAntesReajuste + " reais. ");
            System.out.println("O percentual, do aumento aplicado, foi de 15%. ");
            System.out.println("O valor do aumento do seu salário foi de " + (salarioDepoisReajuste - valorAntesReajuste) + " reais. ");
            System.out.println("O valor do seu novo salário é de " + salarioDepoisReajuste + " reais.");

        }else if ((valorAntesReajuste >=700) && (valorAntesReajuste <1500)) {
            double salarioDepoisReajuste = (valorAntesReajuste + (valorAntesReajuste * salarioAumentado1500));
            System.out.println("O seu salário antes do reajuste, era de " + valorAntesReajuste + " reais. ");
            System.out.println("O percentual, do aumento aplicado, foi de 10%. ");
            System.out.println("O valor do aumento do seu salário foi de " + (salarioDepoisReajuste - valorAntesReajuste) + " reais. ");
            System.out.println("O valor do seu novo salário é de " + salarioDepoisReajuste + " reais.");

        }else if (valorAntesReajuste >=1500) {
            double salarioDepoisReajuste = (valorAntesReajuste + (valorAntesReajuste * salarioApos1500));
            System.out.println("O seu salário antes do reajuste, era de " + valorAntesReajuste + " reais. ");
            System.out.println("O percentual, do aumento aplicado, foi de 5%. ");
            System.out.println("O valor do aumento do seu salário foi de " + (salarioDepoisReajuste - valorAntesReajuste) + " reais. ");
            System.out.println("O valor do seu novo salário é de " + salarioDepoisReajuste + " reais.");
        }

        scanner.close();
    }
}
