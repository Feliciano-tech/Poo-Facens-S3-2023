/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_03_lista_1;

/**
 *
 * @author feliciano
 */
public class Funcionario {

    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float CalcularValorSalario() {

        if (tipoVinculo == 'h') {

            return (valorHora * qtdeHora) - valorDesconto;

        } else {
            return salario - valorDesconto;
        }

    }

    public String Imprimir() {

        return "\nCracha: " + cracha
                + "\nNome: " + nome
                + "\nTipo Vinculo: " + tipoVinculo
                + "\nSalario Bruto: " + salario + " R$"
                + "\nDesconto: " + valorDesconto + " R$" 
                + "\nSalario Liquido: "+CalcularValorSalario()+ " R$"
                + "\n";
    }

}
