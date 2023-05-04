/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;

/**
 *
 * @author feliciano
 */
public class Gerente extends Funcionario {

    private String senha;

    public Gerente() {
    }

    public Gerente(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String cadastrarSenha(String senha) {

        if (senha.length() <= 5) {

            return "Senha deve conter no minimo 5 caracteres";

        } else {
            return "Senha cadastrada com sucesso!!!";

        }

    }

    public boolean autenticarSenha(String senha) {

        if (senha.equals(getSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public void setBonificacao() {
        double salario = 0;
        salario += salario * 0.2;

    }

}
