package br.com.developer.entity;

public enum Regiao implements Empresa{

    INTERURBANO {
        @Override
        public Passagem emitePassagem(Cidade origem, Cidade destino) {
            return new PassagemOnibusInterurbano(origem, destino);
        }
    },
    INTERESTADUAL {
        @Override
        public Passagem emitePassagem(Cidade origem, Cidade destino) {
            return new PassagemOnibusInterestadual(origem, destino);
        }
    },
    URBANO {
        @Override
        public Passagem emitePassagem(Cidade origem, Cidade destino) {
            return new PassagemOnibusUrbano(origem, destino);
        }
    }
}
