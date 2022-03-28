package br.com.developer;

import br.com.developer.entity.*;

public class Main {

    public static void main(String[] args) {

        Cidade cidade1 = new Cidade("Cabedelo", "PB");
        Cidade cidade2 = new Cidade("João Pessoa", "PB");
        Cidade cidade3 = new Cidade("São Paulo", "SP");

        Empresa reunidas = Regiao.URBANO;
        Empresa guanabara = Regiao.INTERURBANO;
        Empresa nacional = Regiao.INTERESTADUAL;

        Passagem passagemUrbana = reunidas.emitePassagem(cidade1, cidade1);
        Passagem passagemInterUrbana = guanabara.emitePassagem(cidade1, cidade2);
        Passagem passagemInterestadual = nacional.emitePassagem(cidade2, cidade3);

        passagemUrbana.exibirDetalhes();
        passagemInterUrbana.exibirDetalhes();
        passagemInterestadual.exibirDetalhes();
    }
}
