/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;

/**
 *
 * @author feliciano
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void atualiza(double taxa) {
        super.saldo += 3 * (super.saldo * taxa);
    }
    
}
