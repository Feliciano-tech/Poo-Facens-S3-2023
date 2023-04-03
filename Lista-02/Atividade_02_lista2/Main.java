/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_02_lista2;

/**
 *
 * @author feliciano
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Apolice apolice = new Apolice();

        int opcao = 0;
        while (opcao != 3) {

            System.out.println("\nMenu:");
            System.out.println("1 - Criar Apolice");
            System.out.println("2 - Ver Dados Apolice");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opcao: ");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("\nDigite o numero da apolice: ");
                    apolice.setNumero(ler.nextInt());
                    System.out.print("Digite o nome do segurado: ");
                    apolice.setNome(ler.next());
                    System.out.print("Digite a idade do segurado: ");
                    apolice.setIdade(ler.nextInt());
                    System.out.print("Digite o sexo do segurado (M/F): ");
                    apolice.setSexo(ler.next().charAt(0));
                    System.out.print("Digite o valor do automovel: ");
                    apolice.setValorAutomovel(ler.nextDouble());

                    break;

                case 2:
                    System.out.println(apolice.imprimir());

                    break;

                case 3:
                    System.out.println("\nEncerrando...");

                    break;

                default:

                    System.out.println("\nopcao invalida digite novamente.\n");

            }
        }

    }
}
