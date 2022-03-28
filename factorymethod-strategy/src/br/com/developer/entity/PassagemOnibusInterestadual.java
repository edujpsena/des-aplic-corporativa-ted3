package br.com.developer.entity;

public class PassagemOnibusInterestadual extends Passagem{

    public PassagemOnibusInterestadual(Cidade origem, Cidade destino) {
        super(origem, destino);
    }

    public void exibirDetalhes() {
        System.out.println("Passagem de onibus interestadual • Origem:  " + this.getOrigem()
                +  " - Destino:  " + this.getDestino());
    }
}
