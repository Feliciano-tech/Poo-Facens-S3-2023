/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_03_lista_1;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author feliciano
 */
public class Main {

    public static void main(String[] args) {

        Funcionario programador = new Funcionario();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {

            System.out.printf("\nMenu");
            System.out.printf("\n1 - Criar Funcionario");
            System.out.printf("\n2 - Mostrar Folha de Pagamento");
            System.out.printf("\n3 - Alterar remuneracao");
            System.out.printf("\n4 - Sair ");
            System.out.printf("\nDigite: ");
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.printf("\nCadastro de novo Funcionario");

                System.out.printf("\nNumero do Cracha: ");
                programador.setCracha(ler.nextInt());

                System.out.printf("Nome: ");
                programador.setNome(ler.next());

                System.out.printf("Tipo de Vinculo: ");
                programador.setTipoVinculo(ler.next().charAt(0));

                if (programador.getTipoVinculo() == 'h') {
                    
                    
                   

                    System.out.printf("Valor da Hora Trabalhada: ");
                    programador.setValorHora(ler.nextFloat());

                    System.out.printf("Quantidade de Horas Trabalhadas: ");
                    programador.setQtdeHora(ler.nextFloat());
                    
                    System.out.printf("Desconto: ");
                    programador.setValorDesconto(ler.nextFloat());
                    
                    programador.setSalario(programador.getValorHora()* programador.getQtdeHora());
                } else {

                    System.out.printf("Salario Bruto: ");
                    programador.setSalario(ler.nextFloat());

                    System.out.printf("Desconto: ");
                    programador.setValorDesconto(ler.nextFloat());
                }

            } else if (opcao == 2) {
                System.out.printf(programador.Imprimir());

            } else if (opcao == 3) {

                System.out.println("\nAlteracao de dados de Funcionario");
                if (programador.getTipoVinculo() == 'h') {

                    System.out.printf("Valor da Hora Trabalhada: ");
                    programador.setValorHora(ler.nextFloat());

                    System.out.printf("Quantidade de Horas Trabalhadas: ");
                    programador.setQtdeHora(ler.nextFloat());
                    
                    System.out.printf("Desconto: ");
                    programador.setValorDesconto(ler.nextFloat());
                    
                    programador.setSalario(programador.getValorHora()* programador.getQtdeHora());

                } else {

                    System.out.printf("Salario Bruto: ");
                    programador.setSalario(ler.nextFloat());

                    System.out.printf("Desconto: ");
                    programador.setValorDesconto(ler.nextFloat());
                }

            } else if (opcao == 4){
                
                System.out.printf("\nEncerrando Aplicacao....");
                
            }

        }

    }

}
