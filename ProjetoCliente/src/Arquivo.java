import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Arquivo {
    Scanner scan = new Scanner(System.in);

    public void Criarfile(Cliente cliente) throws IOException {
        String path = "Cliente.txt";
        File file = new File(path);
        FileWriter arq = new FileWriter(path, true);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Arquivo não encontrado, Criando...");
            }
            escreverArquivo(cliente);
            arq.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escreverArquivo(Cliente cliente) throws IOException {
        String path = "Cliente.txt";
        FileWriter arq = new FileWriter(path, true);
        BufferedWriter buff = new BufferedWriter(arq);
        buff.write(cliente.toString());
        buff.newLine();
        buff.close();
        arq.close();
    }

    public void listarArquivo() throws IOException {
        Path path = Paths.get("Cliente.txt");

        List<String> linhasArquivo = Files.readAllLines(path);
        for (String linha : linhasArquivo) {
            System.out.println(linha);
        }
    }
}