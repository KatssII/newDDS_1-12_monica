package ProfessorPediu.Leitura_e_escrita_de_dados_em_arquivos.EscritaArquivos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            System.out.print(" Informe o nome do jogador " + i + ": ");
            String nome = scanner.nextLine();
            linhas.add(nome);
        }
        Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\arquivo");
        Files.write(arquivo, linhas);
        scanner.close();
    }
}