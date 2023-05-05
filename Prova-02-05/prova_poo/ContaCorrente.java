/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;

/**
 *
 * @author feliciano
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void Depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de deposito invalido");
        }
        final double taxaDeposito = 0.10;
        super.saldo += valor - taxaDeposito;
    }

    @Override
    public void atualiza(double taxa) {
        super.saldo += 2 * (super.saldo * taxa);
    }

}
