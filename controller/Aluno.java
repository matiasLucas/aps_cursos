package controller;

import java.util.ArrayList;
import model.LeiaCsv;

public class Aluno extends LeiaCsv{
	
	public ArrayList<String[]> listaTodosAlunos(){
		String csvPath = "src/arquivos_csv/alunos.csv";		
		ArrayList<String[]> alunos = leitura(csvPath);
		return alunos;
	}
}
