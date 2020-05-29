package view;

import java.util.Scanner;
import controller.Curso;

public class InsereCurso {
Scanner scan = new Scanner(System.in);
	
	public void InserirCurso() {
		String nome;
		String nivel;
		String ano;
		
		System.out.println("escreva o nome:");
		nome = scan.nextLine();
		System.out.println("escreva o nível:");
		nivel = scan.nextLine();
		System.out.println("escreva o ano:");
		ano = scan.nextLine();
		Curso c = new Curso(nome,nivel,ano);
		
		try {
			c.cadastrarCurso();	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao cadastrar");
			System.out.println("Pressione enter para continuar...");
			scan.nextLine();
		}
		
		System.out.println("Curso cadastrado com sucesso, Pressione enter para continuar...");
		scan.nextLine();
	}
}
