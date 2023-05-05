package prova_poo;

public class Main {

    public static void main(String[] args) {

        Agencia agencia = new Agencia("Agência X", "Rua Y, 123");

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        agencia.cadastrarCliente(cliente1);
        agencia.cadastrarCliente(cliente2);

        Conta conta1 = new Conta(0, 500);
        ContaPoupanca conta2 = new ContaPoupanca(0, 1000);
        Conta conta3 = new Conta(0, 0);
        cliente1.setConta(conta1);
        cliente1.setConta(conta2);
        cliente2.setConta(conta3);

        conta1.Depositar(500);
        conta1.Sacar(200);
        conta3.Depositar(500);

        double valorTotal = agencia.valorTotalAgencia();
        System.out.println("Valor total da agencia: R$" + valorTotal);

    }

}
