package view;

import java.util.Scanner;

import controller.Aluno;

public class InsereAluno {
	Scanner scan = new Scanner(System.in);
	
	public void InserirAluno() {
		String id;
		String nome;	
		
		System.out.println("escreva o id:");
		id = scan.nextLine();
		System.out.println("escreva o nome:");
		nome = scan.nextLine();
		Aluno a = new Aluno(id,nome);
		
		try {
			a.cadastrarAluno();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao cadastrar");
			System.out.println("Pressione enter para continuar...");
			scan.nextLine();
		}
		
		System.out.println("Aluno cadastrado com sucesso, Pressione enter para continuar...");
		scan.nextLine();
	}
}
