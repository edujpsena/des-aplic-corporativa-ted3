package br.com.developer;

public class Facade {

    private Cliente cliente;
    private Conta conta;

    public Facade() {
        cliente = new Cliente();
        conta = new Conta();
    }

    public String realizarDeposito(double valor, Cliente cliente, Conta conta){
        String nome = cliente.obterNomeCliente();
        String n_agencia = conta.consultarAgencia();
        String n_conta = conta.consultarConta();

        conta.depositar(valor);

        return "Depositado R$ " + valor
                    + " na conta do beneficiário " + nome
                    + "\nAgencia: " + n_agencia + " Conta: " + n_conta
                    + "\nSaldo atual: " + conta.consultarSaldo();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
