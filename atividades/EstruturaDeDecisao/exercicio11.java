package EstruturaDeDecisao;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salario atual do funcionario: ");
        double salarioAtual = scanner.nextDouble();
        double  aumentosalarial1 = salarioAtual * 0.2;
        double  novoSalario1 = salarioAtual + aumentosalarial1;
        double aumentosalarial2 = salarioAtual * 0.15;
        double novosalario2 = salarioAtual + aumentosalarial2;
        double aumentosalarial3 = salarioAtual * 0.10;
        double novoSalario3 = aumentosalarial3 + salarioAtual;
        double aumentosalarial4 = salarioAtual * 0.05;
        double novoSalario4 = aumentosalarial3 + salarioAtual;
        if (salarioAtual < 280){
            System.out.println("o salario antes do reajuste: " + salarioAtual+ "R$\n");
            System.out.println("O percentual de aumento aplicado: 20% \n");
            System.out.println("valor do aumento: "+ aumentosalarial1 +"R$\n");
            System.out.println("O novo salario do funcionario será: " + novoSalario1+"R$\n");
        }
        else if (salarioAtual >= 280 & salarioAtual < 700) {
            System.out.println("o salario antes do reajuste: " + salarioAtual + "R$\n");
            System.out.println("O percentual de aumento aplicado: 15% \n");
            System.out.println("valor do aumento: " + aumentosalarial2 + "R$\n");
            System.out.println("O novo salario do funcionario será: " + novosalario2 + "R$\n");
        }
        else if (salarioAtual >= 700 & salarioAtual < 1500) {
                System.out.println("o salario antes do reajuste: " + salarioAtual + "R$\n");
                System.out.println("O percentual de aumento aplicado: 10% \n");
                System.out.println("valor do aumento: " + aumentosalarial3 + "R$\n");
                System.out.println("O novo salario do funcionario será: " + novoSalario3 + "R$\n");
            } else if (salarioAtual >= 1500) {

                System.out.println("o salario antes do reajuste: " + salarioAtual + "R$\n");
                System.out.println("O percentual de aumento aplicado: 5% \n");
                System.out.println("valor do aumento: " + aumentosalarial4 + "R$\n");
                System.out.println("O novo salario do funcionario será: " + novoSalario4 + "R$\n");
            }
        }
    }
