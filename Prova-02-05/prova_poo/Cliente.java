/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feliciano
 */
public class Cliente extends Pessoa {

    private List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void casdastrarConta(double saldo, double limite) {
        Conta novaConta = new Conta(saldo, limite);
        this.contas.add(novaConta);

    }

    public void setConta(Conta novaConta) {
        this.contas.add(novaConta);
    }

}
