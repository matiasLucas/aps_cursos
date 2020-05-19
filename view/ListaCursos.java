package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Curso;

public class ListaCursos {
	Scanner scan = new Scanner(System.in);
	public void exibirCursos() {
		Curso c = new Curso();
		ArrayList<String[]> lista = c.listaTodosCursos();
			for (String[] cursos : lista) {
		         for (String curso : cursos) {
		        	 //Falta implementar uma exibição mais organizada
		             System.out.println(curso);
		         }
			}
		scan.nextLine();
	}
}
