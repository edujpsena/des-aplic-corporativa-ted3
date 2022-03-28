package br.com.developer;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eduardo Sena");
        Conta conta = new Conta("1264", "523698", 1000.00);

        Facade facade = new Facade();

        System.out.println(facade.realizarDeposito(150.00, cliente, conta));
    }
}
