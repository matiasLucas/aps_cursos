package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import controller.Curso;

public class ListaCursos extends Curso{
	Scanner scan = new Scanner(System.in);

	public void exibirCursos() {
		Curso c = new Curso();
		ArrayList<String[]> lista = c.listaTodosCursos();
		Iterator<String[]> itLista = lista.iterator();
		
		while(itLista.hasNext()) {
			String[] cursos = itLista.next();
			for (String curso : cursos) { 
				System.out.println(curso);
			}
		}
		System.out.println("Pressione enter para continuar...");
		scan.nextLine();
	}
}
