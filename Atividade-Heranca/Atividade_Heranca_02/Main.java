/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_Heranca_02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feliciano
 */
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Imovel> listaImovel = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n------Menu------");
            System.out.println("1 - Inserir Imovel");
            System.out.println("2 - Exibir Imovel");
            System.out.println("3 - Sair");
            System.out.print("Digite a Opcao Desejada: ");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n------Opcao de Imovel------");
                    System.out.println("1 - Novo");
                    System.out.println("2 - Velho");
                    System.out.print("Digite a Opcao Desejada: ");
                    opcao = ler.nextInt();

                    if (opcao == 1) {
                        System.out.println("\n------Imovel Novo------");
                        System.out.print("Codigo: ");
                        int codigo = ler.nextInt();
                        ler.nextLine(); //consumir quebra de linha
                        System.out.print("Endereco: ");
                        String endereco = ler.nextLine();
                        System.out.print("Valor Bruto: ");
                        double valor = ler.nextDouble();
                        System.out.print("Valor Adicional: ");
                        double valorAdicional = ler.nextDouble();
                        ImovelNovo imovelNovo = new ImovelNovo(valorAdicional, codigo, endereco, valor);

                        listaImovel.add(imovelNovo);

                    } else if (opcao == 2) {

                        System.out.println("\n------Imovel Velho------");
                        System.out.print("Codigo: ");
                        int codigo = ler.nextInt();
                        ler.nextLine(); //consumir quebra de linha
                        System.out.print("Endereco: ");
                        String endereco = ler.nextLine();
                        System.out.print("Valor Bruto: ");
                        double valor = ler.nextDouble();
                        System.out.print("Valor Desconto: ");
                        double valorDesconto = ler.nextDouble();
                        ImovelVelho imovelVelho = new ImovelVelho(valorDesconto, codigo, endereco, valor);
                        listaImovel.add(imovelVelho);

                    } else {
                        System.out.println("\nDigite uma Opcao valida.....");
                    }
                    break;
                case 2:
                    
                    System.out.println("\n-----Imoveis-----");

                    for (Imovel imovel : listaImovel) {

                        System.out.println(imovel.Imprimir());

                        if (imovel instanceof ImovelNovo) {

                            ImovelNovo imovelNovo = (ImovelNovo) imovel;

                            System.out.println("Valor com Taxa Adicional: " + imovelNovo.CalcularValorImovel());

                        } else if (imovel instanceof ImovelVelho) {

                            ImovelVelho imovelVelho = (ImovelVelho) imovel;

                            System.out.println("Valor com Desconto: " + imovelVelho.CalcularValorImovel());
                        }

                    }

                    break;

                case 3:
                    System.out.println("\nEncerrando......");

                    break;

                default:

                    System.out.println("Digite uma Opcao Valida!!!!");

                    break;

            }

        }
    }

}
