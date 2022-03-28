package br.com.developer.entity;

public class PassagemOnibusInterurbano extends Passagem{

    public PassagemOnibusInterurbano(Cidade origem, Cidade destino) {
        super(origem, destino);
    }

    public void exibirDetalhes() {
        System.out.println("Passagem de onibus interurbano • Origem:  " + this.getOrigem()
                +  " - Destino:  " + this.getDestino());
    }
}
