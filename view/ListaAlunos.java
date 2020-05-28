package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import controller.Aluno;

public class ListaAlunos {
	Scanner scan = new Scanner(System.in);
	public void exibirAlunos() {
		Aluno a = new Aluno();
		ArrayList<String[]> lista = a.listaTodosAlunos();
		Iterator<String[]> itLista = lista.iterator();
		
		while(itLista.hasNext()) {
			String[] alunos = itLista.next();
			for (String aluno : alunos) { 
				System.out.println(aluno);
			}
		}
		
		System.out.println("Pressione enter para continuar...");
		scan.nextLine();
	}
}
