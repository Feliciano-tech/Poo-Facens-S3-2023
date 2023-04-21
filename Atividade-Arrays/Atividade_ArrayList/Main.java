/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author feliciano
 */
class Main {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        while (opcao != 6) {
            System.out.println("\nMenu");
            System.out.println("1- Criar curso");
            System.out.println("2- Criar aluno");
            System.out.println("3- Remover aluno");
            System.out.println("4- Mostrar Todos os cursos");
            System.out.println("5- Mostrar alunos do curso");
            System.out.println("6- Sair");
            System.out.print("Digite a opcao desejada: ");

            opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1 -> {
                    Curso c = new Curso();
                    System.out.print("\nDigite o codigo do curso: ");
                    c.setCodigo(Integer.parseInt(ler.nextLine()));
                    System.out.print("Digite o nome do curso: ");
                    c.setNome(ler.nextLine());
                    System.out.print("Digite a carga horaria: ");
                    c.setCargaHoraria(Integer.parseInt(ler.nextLine()));
                    cursos.add(c);
                }
                case 2 -> {
                    Aluno a = new Aluno();
                    System.out.print("\nDigite o RA: ");
                    a.setRa(ler.nextLine());
                    System.out.print("Digite o nome: ");
                    a.setNome(ler.nextLine());
                    System.out.print("Selecione o curso: ");
                    for (int i = 0; i < cursos.size(); i++) {
                        int x = i + 1;
                        System.out.println(x + " - " + cursos.get(i).getNome());
                    }
                    int opcaoDeCurso = Integer.parseInt(ler.nextLine());
                    cursos.get(opcaoDeCurso - 1).setAluno(a);
                }
                case 3 -> {
                    System.out.print("\nDigite o nome do aluno a ser removido");
                    String nomeAlunoRemover = ler.nextLine();
                    for (Curso curso : cursos) {
                        for (int i = 0; i < curso.getAluno().size(); i++) {
                            if (nomeAlunoRemover.
                                    equals(curso.getAluno().get(i).getNome())) {
                                curso.removerAluno(i);
                            }
                        }
                    }
                }
                case 4 -> {
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimir());
                    }
                }
                case 5 -> {
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimirCompleto());
                    }
                }
                case 6 ->
                    System.out.println("Saindo...");
                default ->
                    System.out.println("Opcao invalida.");
            }

        }
    }
}
