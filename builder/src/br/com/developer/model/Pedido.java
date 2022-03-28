package br.com.developer.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<String> dentroDaCaixa = new ArrayList<>();
    private List<String> foraDaCaixa = new ArrayList<>();

    public Pedido() {
    }

    public List<String> getDentroDaCaixa() {
        return dentroDaCaixa;
    }

    public List<String> getForaDaCaixa() {
        return foraDaCaixa;
    }

    public void colocarDentroDaCaixa(String item) {
        getDentroDaCaixa().add(item);
    }

    public void colocarForaDaCaixa(String item) {
        getForaDaCaixa().add(item);
    }
}
