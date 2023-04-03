/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_01_lista_2;

/**
 *
 * @author feliciano
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao = 0;
        double num1, num2, resultado;

        while (opcao != 5) {
            Calculo.Menu();
            opcao = ler.nextInt();

            switch (opcao) {

                case 1 -> {
                    System.out.print("\nDigite o primeiro numero: ");
                    num1 = ler.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    num2 = ler.nextDouble();
                    resultado = Calculo.soma(num1, num2);
                    System.out.println("\nResultado da soma: " + resultado);
                }

                case 2 -> {
                    System.out.print("\nDigite o primeiro numero: ");
                    num1 = ler.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    num2 = ler.nextDouble();
                    resultado = Calculo.subtracao(num1, num2);
                    System.out.println("\nResultado da subtracao: " + resultado);
                }

                case 3 -> {
                    System.out.print("\nDigite o primeiro numero: ");
                    num1 = ler.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    num2 = ler.nextDouble();
                    resultado = Calculo.multiplicacao(num1, num2);
                    System.out.println("\nResultado da multiplicacao: " + resultado);
                }

                case 4 -> {
                    System.out.print("\nDigite o primeiro numero: ");
                    num1 = ler.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    num2 = ler.nextDouble();
                    resultado = Calculo.divisao(num1, num2);
                    System.out.println("\nResultado da divisao: " + resultado);
                }
                    
                case 5 -> System.out.println("\nEncerrando...");
                    
                default -> System.out.println("\nOpcao invalida!");
            }

        }

    }
}
