/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_ac02;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa {

    private String ra;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String ra, String curso) {

        setNome(nome);
        setCpf(cpf);
        this.ra = ra;
        this.curso = curso;

    }

    @Override
    public String toString() {
        return "\nnome: " + getNome()+ "\n"
                + "ra: " + ra + "\n"
                + "cpf: " + getCpf() + "\n"
                + "curso: " + curso;

    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
