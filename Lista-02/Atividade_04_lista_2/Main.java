/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_04_lista_2;

/**
 *
 * @author feliciano
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Vendedor_Static vendedor = new Vendedor_Static();
        int opcao = 0;

        do {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar Vendedor");
            System.out.println("2 - Calcular Comissao");
            System.out.println("3 - Sair");
            System.out.print("Digite a opcao desejada: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o codigo do vendedor: ");
                    vendedor.setCodigo(ler.nextInt());
                    System.out.print("Digite o nome do vendedor: ");
                    vendedor.setNome(ler.next());
                    System.out.print("Digite o percentual de comissao: ");
                    vendedor.setPercentualComissao(ler.nextDouble());
                    System.out.println("Vendedor cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("\nDigite o valor da venda: ");
                    double valorVenda = ler.nextDouble();
                    System.out.print("Digite o valor do desconto: ");
                    double desconto = ler.nextDouble();
                    System.out.println(vendedor.imprimir(valorVenda, desconto));
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 3);

        ler.close();
    }
}
