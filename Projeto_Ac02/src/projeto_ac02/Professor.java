/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_ac02;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Professor extends Funcionario {

    private String urlCurriculoLattes;

    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

    public Professor(String nome, String cpf, String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
        setNome(nome);
        setCpf(cpf);
    }

    @Override
    public String toString() {
        return "\nNome" + getNome()
                + "\nCpf" + getCpf()
                + "\nurlCurriculoLattes" + urlCurriculoLattes;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplina.add(disciplina);
    }

    public void removeDisciplina(int index) {
        disciplina.remove(index);
    }

    public void removeDisciplina(Disciplina disciplina) {
        this.disciplina.remove(disciplina);
    }

    public void getDisciplina(int index) {
        disciplina.get(index);
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

}
