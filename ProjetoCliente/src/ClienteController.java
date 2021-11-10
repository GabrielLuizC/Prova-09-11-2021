import java.io.IOException;
import java.util.Scanner;

public class ClienteController {
    public void menuCadastro() throws IOException {
        Scanner scan = new Scanner(System.in);
        Arquivo file = new Arquivo();

        System.out.println("=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("DIGITE O NOME DO CLIENTE: ");
        String tmp = scan.nextLine().toUpperCase();

        System.out.printf("\nDIGITE O CPF DO CLIENTE: ");
        String tmp1 = scan.nextLine();

        System.out.printf("\nDIGITE O TELEFONE DO CLIENTE: ");
        String tmp2 = scan.nextLine();
        System.out.println("=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        Cliente cliente = new Cliente(tmp, tmp1, tmp2);
        cliente.setNome(tmp);
        cliente.setCpf(tmp1);
        cliente.setTel(tmp2);

        file.Criarfile(cliente);
        System.out.println(cliente.toString());
    }
}
