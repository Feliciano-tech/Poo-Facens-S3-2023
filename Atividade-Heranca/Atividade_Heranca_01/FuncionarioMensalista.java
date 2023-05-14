/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_Heranca;

/**
 *
 * @author feliciano
 */
public class FuncionarioMensalista extends Funcionario {

    private double salario;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao,double salario) {
        setnumeroCracha(numeroCracha);
        setNome(nome);
        setSetor(setor);
        setFuncao(funcao);
        this.salario = salario;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString(){
         return "\nN do Cracha:" + getnumeroCracha() +
                "\nNome: "+ getNome()+
                "\nSetor: "+ getSetor()+
                "\nFuncao: "+ getSetor()+
                "\nSalario: "+ salario+" R$" ;
    }

}
