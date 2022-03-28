package br.com.developer.entity;

public class PassagemOnibusUrbano extends Passagem{

    public PassagemOnibusUrbano(Cidade origem, Cidade destino) {
        super(origem, destino);
    }

    public void exibirDetalhes() {
        System.out.println("Passagem de onibus urbano • Origem:  " + this.getOrigem()
                +  " - Destino:  " + this.getDestino());
    }
}
