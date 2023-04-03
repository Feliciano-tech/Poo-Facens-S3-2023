/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_03_lista_2;

/**
 *
 * @author feliciano
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar Vendedor");
            System.out.println("2 - Calcular Comissao");
            System.out.println("3 - Sair");
            System.out.print("Escolha a opcao desejada: ");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o codigo do vendedor: ");
                    int codigo = ler.nextInt();
                    vendedor.setCodigo(codigo);

                    System.out.print("Informe o nome do vendedor: ");
                    String nome = ler.next();
                    vendedor.setNome(nome);

                    System.out.print("Informe o percentual de comissao do vendedor: ");
                    double percentual = ler.nextDouble();
                    vendedor.setPercentualComissao(percentual);

                    System.out.println("Vendedor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("\nInforme o valor da venda:");
                    double venda = ler.nextDouble();

                    System.out.print("Informe o valor do desconto:");
                    double desconto = ler.nextDouble();

                    String resultado = vendedor.imprimir(venda, desconto);
                    System.out.println(resultado);
                    break;

                case 3:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("\nDigite uma opcao valida...");
                    break;
            }
        }

        ler.close();
    }
}
