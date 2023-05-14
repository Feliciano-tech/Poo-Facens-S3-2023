/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_Heranca;

/**
 *
 * @author feliciano
 */
public class FuncionarioHorista extends Funcionario {

    private int qtdHoras;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdHora, double valorHora) {
        setnumeroCracha(numeroCracha);
        setNome(nome);
        setSetor(setor);
        setFuncao(funcao);
        this.qtdHoras = qtdHora;
        this.valorHora = valorHora;

    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {

        return "\nN do Cracha: " + getnumeroCracha()
                + "\nNome: " + getNome()
                + "\nSetor: " + getSetor()
                + "\nFuncao: " + getSetor()
                + "\nQuantidade de Horas Trabalhadas: " + qtdHoras + "H"
                + "\nValor Pago por Hora Trabalhada: " + valorHora + " R$";

    }

}
