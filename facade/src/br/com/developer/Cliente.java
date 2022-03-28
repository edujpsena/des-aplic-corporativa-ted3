package br.com.developer;

public class Cliente {

    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String obterNomeCliente() {
        return getNome();
    }
}
