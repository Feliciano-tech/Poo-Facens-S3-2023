/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa {

    private int chapa;
    private double salario;

    public Funcionario() {
        Random r = new Random();
        chapa = r.nextInt(0, 1000);

    }

    public Funcionario(int chapa, double salario) {
        this.chapa = chapa;
        this.salario = salario;
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;

        } else {
            System.out.println("O salario é inferior a 0");

        }
    }
    
    public void setBonificacao(){
        salario += salario *0.1;
        
    }

}
