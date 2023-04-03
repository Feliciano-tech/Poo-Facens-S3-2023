/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_01_lista_2;

/**
 *
 * @author feliciano
 */
public class Calculo {

    public static void Menu() {
        System.out.println("\nMenu");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.printf("Digite a opcao desejada: ");

    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static int divisao(int num1, int num2) {
        return num1 / num2;
    }

    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }

}
