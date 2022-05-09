package ProfessorPediu.Leitura_e_escrita_de_dados_em_arquivos.LeituraArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;

public class LeituraArquivos {
    public static void main(String[] args) throws IOException {
     Path arquivo = Paths.get("C:\\Users\\Aluno\\Desktop\\exercicio.txt");
        List<String> linhas = Files.readAllLines(arquivo);
        for (int i = 0; i < linhas.size(); i++) {
            String nome = linhas.get(1);
            System.out.println("Jogador " + i + ": " + nome);
        }
    }
}
