/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;



/**
 *
 * @author feliciano
 */
public class Conta implements ContaDeBanco {

    protected double saldo;
    private double limite;
    
    public Conta(double saldo, double limite){
        
    }

    
    @Override
    public void Depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de deposito invalido");
        }
        saldo += valor;
    }

    @Override
    public String Sacar(double valor) {
        if (valor <= 0) {
            return "Valor invalido para saque";
        }
        if (saldo < valor) {
            return "Saldo insuficiente para realizacao de saque";
        } else {
            saldo -= valor;
            return "Saque realizado com sucesso";
        }
    }

    @Override
    public String Transferir(Conta contaDestino, double valor) {
        if (saldo < valor) {
            return "Saldo insuficiente para realizar a transferencia";
        }
        if (valor <= 0) {
            return "Valor de transferencia invalido";
        }
        if (contaDestino == null) {
            return "Conta de destino invalida";
        }
        if (contaDestino == this) {
            return "Nao é possivel transferir para a mesma conta";
        }

        saldo -= valor;
        contaDestino.Depositar(valor);

        return "Transferencia realizada com sucesso";
    }

    public void atualiza(double taxa) {
        double saldoAtualizado = saldo + (saldo * taxa);
        saldo = saldoAtualizado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
