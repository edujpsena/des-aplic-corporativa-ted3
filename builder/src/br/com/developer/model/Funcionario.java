package br.com.developer.model;

public class Funcionario {

    private Pedido pedido;

    public Funcionario() {
        pedido = new Pedido();
    }

    public void buildSanduiche(String sanduiche) {
        pedido.colocarDentroDaCaixa(sanduiche);
    }

    public void buildBatata(String batata) {
        pedido.colocarDentroDaCaixa(batata);
    }

    public void buildBrinquedo(String brinquedo) {
        pedido.colocarForaDaCaixa(brinquedo);
    }

    public void buildRefrigerante(String refrigerante) {
        pedido.colocarForaDaCaixa(refrigerante);
    }

    public Pedido getPedido() {
        return pedido;
    }
}
