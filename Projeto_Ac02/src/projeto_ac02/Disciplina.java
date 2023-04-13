/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_ac02;

/**
 *
 * @author aluno
 */
public class Disciplina {

    private int codigo;
    private String nome;

    public Disciplina() {
    }

    public Disciplina(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;

    }

    @Override
    public String toString() {
        return "\nnome" + nome+ "\n"
                + "codigo" + codigo; 
    }
    
    

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
}
