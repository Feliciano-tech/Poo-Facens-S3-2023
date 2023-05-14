/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_Heranca_02;

/**
 *
 * @author feliciano
 */
public class ImovelNovo extends Imovel {

    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(double valorAdicional, int codigo, String endereco, double valor) {
        
        setCodigo(codigo);
        setEndereco(endereco);
        setValor(valor);
        this.valorAdicional = valorAdicional;
        
        
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double CalcularValorImovel() {
        return getValor() + getValorAdicional();

    }

    @Override
    public String Imprimir(){
        return super.Imprimir() + "\nValor Adicional: " + valorAdicional;
        
    }

}
