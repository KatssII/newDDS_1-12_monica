package EstruturaSequencial;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanhoDoarquivo = scanner.nextDouble();
        System.out.print("Informe a velocidade de download em Mbps: ");
        double velocidadeDeLinkDeInternet = scanner.nextDouble();
        byte fatorDeConversaoEmSegundos = 60;
        byte fatorDeConversaoEmMinutos = 8;
        double tempoAproximadoDeDownloadEmSegundos = tamanhoDoarquivo / (velocidadeDeLinkDeInternet / fatorDeConversaoEmMinutos);
        double tempoAproximadoDeDonwloadEmMinutos= tempoAproximadoDeDownloadEmSegundos / fatorDeConversaoEmSegundos;
        System.out.print("O tempo aproximado de Download é de: " + tempoAproximadoDeDonwloadEmMinutos + " minutos.");
        scanner.close();
    }
}
