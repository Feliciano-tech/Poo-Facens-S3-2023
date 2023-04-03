package Atividade_01_lista_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
        Pessoa p = new Pessoa();

        Scanner ler = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("\nMenu:");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Mostrar Pessoa");
            System.out.println("3 - Sair");
            System.out.printf("Escolha a opcao desejada:");
            opcao = Integer.parseInt(ler.nextLine());
            switch (opcao) {
                case 1:

                    System.out.print("\nDigite o CPF: ");
                    p.setCpf(ler.nextLine());
                    System.out.print("Digite o nome: ");
                    p.setNome(ler.nextLine());
                    System.out.print("Digite o caracter do sexo: ");
                    p.setSexo(ler.nextLine().charAt(0));
                    System.out.print("Digite a idade: ");
                    p.setIdade(Integer.parseInt(ler.nextLine()));

                    break;
                case 2:

                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    System.out.println("\nOpcao Invalida");
            }
        }
        ler.close();

    }
}
