/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author feliciano
 */
public class Curso {

    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> aluno = new ArrayList<Aluno>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = this.aluno;
    }

    public Curso() {
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;

    }

    public void inserirAluno(Aluno aluno) {
        this.aluno.add(aluno);
    }

    public void removerAluno(int index) {
        this.aluno.remove(index);
    }

    public String imprimir() {
        return "\nCodigo: " + codigo
                + "\nNome: " + nome
                + "\ncargaHoraria: " + cargaHoraria + "\n";

    }

    public String imprimirCompleto() {
        String retorno = imprimir();
        for (Aluno aluno : aluno) {
            retorno += aluno.imprimir();
        }
        return retorno;
    }
}
