package controller;

import java.util.ArrayList;
import model.LeiaCsv;

public class Aluno {
	
	public ArrayList<String[]> listaTodosAlunos(){
		LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "src/arquivos_csv/alunos.csv";		
		ArrayList<String[]> alunos = objLerCsv.leitura(csvPath);
		return alunos;
	}
}
