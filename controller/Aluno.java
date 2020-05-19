package controller;

import java.util.ArrayList;
import model.LeiaCsv;

public class Aluno {
	
	public ArrayList<String[]> listaTodosAlunos(){
		LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "C:\\Users\\teixe\\OneDrive\\Documentos\\01\\alunos.csv";		
		ArrayList<String[]> alunos = objLerCsv.leitura(csvPath);
		return alunos;
	}
}
