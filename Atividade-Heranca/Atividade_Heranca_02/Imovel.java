/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_Heranca_02;

/**
 *
 * @author feliciano
 */
public class Imovel {

    private int codigo;
    private String endereco;
    private double valor;

    public Imovel() {

    }

    public Imovel(int codigo, String endereco, double valor) {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String Imprimir() {
        return 
                 "\nCodigo: " + codigo
                + "\nEndereco: " + endereco
                + "\nValor: " + valor;

    }

}
