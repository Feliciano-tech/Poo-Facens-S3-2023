/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_Heranca;

/**
 *
 * @author feliciano
 */
public class Funcionario {

    private int numeroCracha;
    private String nome;
    private String setor;
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(int numeroCracha, String nome, String setor, String funcao) {
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;

    }

    public int getnumeroCracha() {
        return numeroCracha;
    }

    public void setnumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "\nNumero Cracha: " + numeroCracha
                + "Nome: " + nome
                + "Setor: " + setor
                + "Funcao: " + funcao;
    }

}
