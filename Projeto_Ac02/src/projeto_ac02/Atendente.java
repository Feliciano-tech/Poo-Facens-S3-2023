/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_ac02;

/**
 *
 * @author aluno
 */
public class Atendente extends Funcionario {

    private String setor;
    private String funcao;

    public Atendente() {
    }

    public Atendente(String nome, String cpf, String setor, String funcao) {
        this.funcao = funcao;
        this.setor = setor;
        setNome(nome);
        setCpf(cpf);

    }

    @Override
    public String toString() {
        return "\nnome" + getNome() + "\n"
                + "cpf" + getCpf() + "\n"
                + "Setor" + setor + "\n"
                + "Funcao" + funcao;
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

}
