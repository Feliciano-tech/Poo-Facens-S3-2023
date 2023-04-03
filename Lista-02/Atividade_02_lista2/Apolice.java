/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_02_lista2;

/**
 *
 * @author feliciano
 */

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;
    
    public Apolice() {}
    
    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }
    
    public double calcularValor() {
        if (sexo == 'M'|| sexo == 'm' && idade <= 25) {
            return (valorAutomovel * 10) / 100;
        } else if (sexo == 'M'|| sexo == 'm' && idade > 25) {
            return (valorAutomovel * 5) / 100;
        } else if (sexo == 'F'|| sexo == 'f') {
            return (valorAutomovel * 2) / 100;
        } else {
            return 0;
        }
    }
    
    public String imprimir() {
        double valorApolice = calcularValor();
        String resultado = "\nNumero: " + numero + "\n" +
                           "Nome: " + nome + "\n" +
                           "Idade: " + idade + "\n" +
                           "Sexo: " + sexo + "\n" +
                           "Valor Automovel: " + valorAutomovel + "\n" +
                           "Valor Apolice: " + valorApolice + "\n";
        return resultado;
    }
 
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public double getValorAutomovel() {
        return valorAutomovel;
    }
    
    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
}

