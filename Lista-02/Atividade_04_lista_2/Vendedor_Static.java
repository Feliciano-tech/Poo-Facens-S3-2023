/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_04_lista_2;

public class Vendedor_Static {

    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor_Static() {
    }

    public Vendedor_Static(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
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

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public static double calcularPagamentoComissao(double valorVenda) {
        return calcularPagamentoComissao(valorVenda);
    }

    public static double calcularPagamentoComissao(double valorVenda, double percentualComissao, double desconto) {
    double valorComissao = (valorVenda * percentualComissao)/100 ;
    double valorDesconto = desconto;
    return valorComissao - valorDesconto;
}

    public String imprimir(double valorVenda, double desconto) {
    double pagamentoComissao = Vendedor_Static.calcularPagamentoComissao(valorVenda, percentualComissao, desconto);

    return "\nCodigo: " + codigo + "\n"
            + "Nome: " + nome + "\n"
            + "Valor Venda: " + valorVenda + " R$" + "\n"
            + "% Comissao: " + percentualComissao + "%" + "\n"
            + "Desconto: " + desconto + " R$" + "\n"
            + "Valor a Pagar: " + pagamentoComissao + " R$";
}

}
