import java.io.IOException;

import java.util.*;

public class ClienteView {
    ClienteController clientecontroller = new ClienteController();
    Arquivo file = new Arquivo();
    Scanner scan = new Scanner(System.in);

    public void avancar(){
        int temp;
        System.out.println("Confirmação de Sistema, Digite 1: ");
        temp = scan.nextInt();
    }

    public void menuCliente() throws IOException {
        System.out.println("=-=  Controle de Cliente  =-=");
        System.out.println("    1 - Cadastrar Cliente      ");
        System.out.println("    2 - Listar Cliente       ");
        System.out.println("    3 - Selecionar Cliente          ");
        System.out.println("    4 - Sair                 ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("\nEscolha qual menu deseja: ");
        int escolhe = scan.nextInt();
        switch (escolhe){
            case 1:
                clientecontroller.menuCadastro();
                avancar();
                menuCliente();
                break;
            case 2:
                file.listarArquivo();
                avancar();
                menuCliente();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Error - Reinicie o Sistema");
        }
    }
}
