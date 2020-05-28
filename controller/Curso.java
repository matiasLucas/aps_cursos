package controller;

import java.util.ArrayList;
import model.LeiaCsv;

public class Curso {
	
	public ArrayList<String[]> listaTodosCursos(){
		LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "src/arquivos_csv/cursos.csv";		
		ArrayList<String[]> cursos = objLerCsv.leitura(csvPath);
		return cursos;
	}
}
