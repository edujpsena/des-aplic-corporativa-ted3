package br.com.developer.entity;

public abstract class Passagem {

    private Cidade origem;
    private Cidade destino;

    public Passagem() {
    }

    public Passagem(Cidade origem, Cidade destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Passagem{" +
                "origem=" + origem +
                ", destino=" + destino +
                '}';
    }

    public abstract void exibirDetalhes();
}
