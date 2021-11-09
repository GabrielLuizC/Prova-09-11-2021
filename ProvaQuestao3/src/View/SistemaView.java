package View;

import Controller.SistemaController;
import Model.Sistema;

import java.util.*;

public class SistemaView {

    SistemaController controller = new SistemaController();
    Sistema sistema = new Sistema();
    Scanner scan = new Scanner(System.in);

    public void menu(){
        int escolhe;

        System.out.println("1 - Cadastrar na Lista");
        System.out.println("2 - Printar Lista");
        System.out.println("3 - Declarar Media | Maior | Menor");
        System.out.println("4 - Sair\n");

        System.out.println("Escolha uma das opções: ");
        escolhe = scan.nextInt();

        switch (escolhe){
            case 1:
                controller.inserirValores(sistema);
                controller.avancar();
                menu();
                break;
            case 2:
                controller.printarValores(sistema);
                controller.avancar();
                menu();
                break;
            case 3:
                controller.mediaValores(sistema);
                controller.avancar();
                menu();
                break;
            case 4:
                System.out.println("Saindo do Sistema");
                break;
            default:
                System.out.println("ERROR");
        }
    }


}

