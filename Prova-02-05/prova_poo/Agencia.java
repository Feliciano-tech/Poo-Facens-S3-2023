/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feliciano
 */
public class Agencia {

    private String nome;
    private String endereco;
    private List<Funcionario> listaFuncionario = new ArrayList<>();
    private List<Cliente> listaCliente = new ArrayList<>();

    public Agencia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public void cadastrarCliente(Cliente cliente) {
        listaCliente.add(cliente);

    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        listaFuncionario.add(funcionario);
    }

    public double valorTotalAgencia() {
        double valorTotal = 0;

        for (Cliente cliente : listaCliente) {
            for (Conta conta : cliente.getContas()) {
                valorTotal += conta.getSaldo();

            }
        }
        return valorTotal;
    }

}
