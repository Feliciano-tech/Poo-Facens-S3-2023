/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_ArrayList_02;

/**
 *
 * @author feliciano
 */
import java.util.ArrayList;

public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis;

    public Pessoa() {
        automoveis = new ArrayList<Automovel>();
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        automoveis = new ArrayList<Automovel>();
    }

    public void inserirAutomovel(Automovel automovel) {
        automoveis.add(automovel);
    }

    public void removerAutomovel(int index) {
        automoveis.remove(index);
    }

    public String imprimir() {
        return "Codigo: " + codigo + "\nNome: " + nome + "\nNumero de automoveis: " + automoveis.size();
    }

    public String imprimirCompleto() {
        String automoveisStr = "";
        for (Automovel automovel : automoveis) {
            automoveisStr += automovel.imprimir() + "\n";
        }
        return "Codigo: " + codigo + "\nNome: " + nome + "\nAutomoveis: \n" + automoveisStr;
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

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

}
