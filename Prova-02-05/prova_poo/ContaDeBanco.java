/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;

/**
 *
 * @author feliciano
 */
public interface ContaDeBanco {

    public void Depositar(double valor);

    public String Sacar(double valor);

    public String Transferir(Conta conta, double valor);

}
