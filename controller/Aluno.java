package controller;

import java.util.ArrayList;

import model.LeiaCsv;

public class Aluno {
	
	public static void main(String[] args) {
		Aluno a = new Aluno();
		ArrayList<?> lista = a.listaTodosAlunos();
		
	}
	
	public ArrayList<?> listaTodosAlunos(){
		LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "C:\\Users\\teixe\\OneDrive\\Documentos\\01\\cursos.csv";		
		ArrayList<?> alunos = objLerCsv.leitura(csvPath);
		return alunos;
	}
}
