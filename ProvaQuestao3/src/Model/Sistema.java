package Model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public List<String> valores = new ArrayList<String>();
    private String [] valor = new String[10];

    public Sistema() {
    }

    public Sistema(String[] valor) {
        this.valor = valor;
    }

    public String[] getValor() {
        return valor;
    }

    public void setValor(String[] valor) {
        this.valor = valor;
    }
}
