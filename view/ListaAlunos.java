package view;

import java.util.ArrayList;
import controller.Aluno;

public class ListaAlunos {
	
	public void exibirAlunos() {
		Aluno a = new Aluno();
		ArrayList<String[]> lista = a.listaTodosAlunos();
			for (String[] alunos : lista) {
		         for (String aluno : alunos) {
		        	 //Falta implementar uma exibição mais organizada
		             System.out.println (aluno);
		         }
			}
	}
}
