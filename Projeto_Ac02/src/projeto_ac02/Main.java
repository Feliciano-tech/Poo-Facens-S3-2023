/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_ac02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        // ArrayList<Professor> listaprofessor = new ArrayList<Professor>();
        //ArrayList<Atendente> listaAtendente = new ArrayList<Atendente>();
        //ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        while (opcao != 6) {
            System.out.print("\nMenu");
            System.out.print("\n1 - Inserir Disciplina ");
            System.out.print("\n2 - Inserir Professor ");
            System.out.print("\n3 - Inserir Atendente ");
            System.out.print("\n4 - Inserir Aluno ");
            System.out.print("\n5 - Adicionar Disciplina ao Professor ");
            System.out.print("\n6 - Mostrar Pessoas ");
            System.out.print("\n6 - Sair");
            System.out.print("\nDigite a Opcao Desejada: ");
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o Nome da Disciplina: ");
                String nome = ler.next();
                System.out.println("Digite o codigo da Disciplina: ");
                int codigo = ler.nextInt();
                Disciplina disciplina = new Disciplina(codigo, nome);
                System.out.println("Disciplina Criada com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Digite o nome: ");
                String nome = ler.next();
                System.out.println("Digite o Cpf: ");
                String cpf = ler.next();
                System.out.println("Digite o urlCurriculoLattes: ");
                String urlCurriculoLattes = ler.next();
                Professor professor = new Professor(nome, cpf, urlCurriculoLattes);
                listaPessoas.add(professor);
                System.out.println("Professor adicionado com sucesso!");

            } else if (opcao == 3) {
                System.out.println("Digite o nome: ");
                String nome = ler.next();
                System.out.println("Digite o Cpf: ");
                String cpf = ler.next();
                System.out.println("Digite o setor: ");
                String setor = ler.next();
                System.out.println("Digite o funcao: ");
                String funcao = ler.next();
                Atendente atendente = new Atendente(nome, cpf, setor, funcao);
                listaPessoas.add(atendente);
                System.out.println("Atendente adicionado com sucesso!");

            } else if (opcao == 4) {
                System.out.println("Digite o nome: ");
                String nome = ler.next();
                System.out.println("Digite o Cpf: ");
                String cpf = ler.next();
                System.out.println("Digite o numero do RA: ");
                String ra = ler.next();
                System.out.println("Digite o Curso: ");
                String curso = ler.next();
                Aluno aluno = new Aluno(nome, cpf, ra, curso);
                listaPessoas.add(aluno);
                System.out.println("Aluno adicionado com sucesso!");

            } else if (opcao == 5) {
                
                
                
            } else if (opcao == 6) {
                System.out.println("Pessoas Cadastradas");

                for (int i = 0; i < listaPessoas.size(); i++) {
                    System.out.println(listaPessoas.get(i));

                }

            }

        }

    }

}
