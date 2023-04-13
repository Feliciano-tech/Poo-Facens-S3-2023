/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_ac02;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa {

    private int numeroCracha;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int numeroCracha, double salario) {

        this.numeroCracha = numeroCracha;
        this.salario = salario;
        setNome(nome);
        setCpf(cpf);

    }

    @Override
    public String toString() {
        return "\nnome" + getNome() + "\n"
                + "cpf" + getCpf() + "\n"
                + "Numero Cracha" + numeroCracha + "\n"
                + "Salario" + salario;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
