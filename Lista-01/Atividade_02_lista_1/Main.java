/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_02_lista_1;

import java.util.Scanner;

/**
 *
 * @author feliciano
 */
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Aluno estudante = new Aluno();
        int opcao = 0;

        while (opcao != 3) {

            System.out.printf("\nMenu");
            System.out.printf("\n1 - Criar Aluno");
            System.out.printf("\n2 - Mostrar Aluno");
            System.out.printf("\n3 - Sair");
            System.out.printf("\nDigite: ");
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.printf("\nDigite o Ra: ");
                estudante.setRa(ler.next());

                System.out.printf("Digite seu Nome: ");
                estudante.setNome(ler.next());

                System.out.printf("Digite a Nota Ac01: ");
                estudante.setAc01(ler.nextFloat());

                System.out.printf("Digite a Nota Ac02: ");
                estudante.setAc02(ler.nextFloat());

                System.out.printf("Digite a Nota Ag: ");
                estudante.setAg(ler.nextFloat());

                System.out.printf("Digite a Nota Af: ");
                estudante.setAf(ler.nextFloat());

            } else if (opcao == 2) {
                System.out.println(estudante.Imprimir());

            } else if (opcao == 3) {
                System.out.println("\nAte a Proxima....");
            }
            else {
                System.out.println("\nPor favor escolha uma das opcoes pre definidas.");
            }

        }

    }

}
