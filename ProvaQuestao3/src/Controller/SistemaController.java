package Controller;

import Model.Sistema;

import java.util.*;

public class SistemaController {

    Scanner scan = new Scanner(System.in);

    public void inserirValores(Sistema sistema) {
        String[] aux = new String[10];
        String recebe;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira o valor %d: ", i);
            recebe = scan.nextLine();
            aux[i] = recebe;
            sistema.valores.add(aux[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(sistema.valores.get(i));
        }
    }

    public void printarValores(Sistema sistema){
        for (int i = 0; i < 10; i++) {
            System.out.println(sistema.valores.get(i));
        }
    }

    public void mediaValores(Sistema sistema){
        int [] aux = new int[10];
        int menor = 9999999, maior = 0, recebe = 0, tmp = 0;

        for (int i = 0; i < 10; i++) {
            aux[i] = Integer.parseInt(sistema.valores.get(i));
            recebe = recebe + aux[i];
        }

        System.out.println("A media dos valores colocados é: " + recebe/10);

        for(int i = 0; i < 10; i++){
            if(aux[i] > maior){
                maior = aux[i];
            }
            if(aux[i] < menor){
                menor = aux[i];
            }
            tmp = maior - menor;
        }

        System.out.println("O Maior valor digitado : " + maior);
        System.out.println("o Menor valor digitado : " + menor);
    }

    public void avancar(){
        int temp;
        System.out.println("Confirmação de Sistema, Digite 1: ");
        temp = scan.nextInt();
    }
}
