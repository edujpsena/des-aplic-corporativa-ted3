package br.com.developer;

public class Conta {

    private String nAgencia;
    private String nConta;
    private Double saldo;

    public Conta() {
    }

    public Conta(String nAgencia, String nConta, Double saldo) {
        this.nAgencia = nAgencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        System.out.println("Executando deposito");
        this.setSaldo(this.saldo + valor);
    }

    public String consultarAgencia() {
        System.out.println("Obtendo numero da agência");
        return nAgencia;
    }

    public void setnAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    public String consultarConta() {
        System.out.println("Obtendo numero da conta");
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public Double consultarSaldo() {
        System.out.println("Obtendo saldo");
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


}
