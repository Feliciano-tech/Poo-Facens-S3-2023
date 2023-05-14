/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_Heranca_02;

/**
 *
 * @author feliciano
 */
public class ImovelVelho extends Imovel{
    
    private double valorDesconto;

    public ImovelVelho(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public ImovelVelho(double valorDesconto, int codigo, String endereco, double valor) {
        setCodigo(codigo);
        setEndereco(endereco);
        setValor(valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public double CalcularValorImovel(){
        return getValor() - getValorDesconto();
    }

    
    @Override
    public String Imprimir(){
        return super.Imprimir() + "\nValor Desconto: " + valorDesconto;
    }
    
    
    
    
    
    
    
    
}
