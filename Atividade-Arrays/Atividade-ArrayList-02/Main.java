/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_ArrayList_02;

/**
 *
 * @author feliciano
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("\n-- Menu --");
            System.out.println("1- Criar Pessoa");
            System.out.println("2- Criar Automovel");
            System.out.println("3- Transferir Automovel");
            System.out.println("4- Mostrar Todas as Pessoas");
            System.out.println("5- Mostrar Automoveis de uma Pessoa");
            System.out.println("6- Sair");
            System.out.print("Digite uma opcao: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    criarPessoa();
                    break;
                case 2:
                    criarAutomovel();
                    break;
                case 3:
                    transferirAutomovel();
                    break;
                case 4:
                    mostrarTodasAsPessoas();
                    break;
                case 5:
                    mostrarAutomoveisDaPessoa();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    private static void criarPessoa() {
        System.out.print("\nDigite o codigo da pessoa: ");
        int codigo = ler.nextInt();
        System.out.print("Digite o nome da pessoa: ");
        String nome = ler.next();
        Pessoa pessoa = new Pessoa(codigo, nome);
        pessoas.add(pessoa);
        System.out.println("\nPessoa criada com sucesso!");
    }

    private static void criarAutomovel() {

        System.out.print("\nDigite a marca do automovel: ");
        String marca = ler.next();
        System.out.print("Digite o modelo do automovel: ");
        String modelo = ler.next();
        Automovel automovel = new Automovel(marca, modelo);
        System.out.println("\n-- Pessoas --");
        if (pessoas.isEmpty()) {
            System.out.println("Nao existem pessoas cadastradas!");
            return;
        }
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
        }
        System.out.print("Escolha a pessoa que possui o automovel: ");
        int indexPessoa = ler.nextInt() - 1;
        Pessoa pessoa = pessoas.get(indexPessoa);
        pessoa.inserirAutomovel(automovel);
        System.out.println("Automóvel adicionado com sucesso para a pessoa " + pessoa.getNome() + "!");
    }

    private static void transferirAutomovel() {
        System.out.println("\n-- Pessoas --");
        if (pessoas.isEmpty()) {
            System.out.println("Nao existem pessoas cadastradas!");
            return;
        }
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
        }
        System.out.print("Escolha a pessoa de origem: ");
        int indexPessoaOrigem = ler.nextInt() - 1;
        Pessoa pessoaOrigem = pessoas.get(indexPessoaOrigem);
        System.out.println("\n-- Automoveis --");
        if (pessoaOrigem.getAutomoveis().isEmpty()) {
            System.out.println("A pessoa selecionada nao possui automoveis!");
            return;
        }
        for (int i = 0; i < pessoaOrigem.getAutomoveis().size(); i++) {
            System.out.println((i + 1) + " - " + pessoaOrigem.getAutomoveis().get(i).getMarca() + " "
                    + pessoaOrigem.getAutomoveis().get(i).getModelo());
        }
        System.out.print("Escolha o automovel que deseja transferir: ");
        int indexAutomovel = ler.nextInt() - 1;
        Automovel automovel = pessoaOrigem.getAutomoveis().get(indexAutomovel);
        System.out.println("\n-- Pessoas --");
        for (int i = 0; i < pessoas.size(); i++) {
            if (i != indexPessoaOrigem) {
                System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
            }
        }
        System.out.print("Escolha a pessoa de destino: ");
        int indexPessoaDestino = ler.nextInt() - 1;
        Pessoa pessoaDestino = pessoas.get(indexPessoaDestino);
        pessoaOrigem.removerAutomovel(indexAutomovel);
        pessoaDestino.inserirAutomovel(automovel);
        System.out.println("Automovel transferido com sucesso da pessoa " + pessoaOrigem.getNome()
                + " para a pessoa " + pessoaDestino.getNome() + "!");
    }

    private static void mostrarTodasAsPessoas() {
        System.out.println("\n-- Pessoas --");
        if (pessoas.isEmpty()) {
            System.out.println("Nao existem pessoas cadastradas!");
            return;
        }
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).imprimir());
        }
    }

    private static void mostrarAutomoveisDaPessoa() {
        System.out.println("\n-- Pessoas --");
        if (pessoas.isEmpty()) {
            System.out.println("Nao existem pessoas cadastradas!");
            return;
        }
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
        }
        System.out.print("\nEscolha a pessoa para listar os automoveis: ");
        int indexPessoa = ler.nextInt() - 1;
        Pessoa pessoa = pessoas.get(indexPessoa);
        System.out.println(pessoa.imprimirCompleto());
    }
}
