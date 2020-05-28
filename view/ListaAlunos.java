package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Aluno;

public class ListaAlunos {
	Scanner scan = new Scanner(System.in);
	public void exibirAlunos() {
		Aluno a = new Aluno();
		ArrayList<String[]> lista = a.listaTodosAlunos();
			for (String[] alunos : lista) {
		         for (String aluno : alunos) {
		        	 //Falta implementar uma exibição mais organizada
		             System.out.println (aluno);
		            
		         }
			} 
		System.out.println("Pressione enter para continuar...");
		scan.nextLine();
	}
}
