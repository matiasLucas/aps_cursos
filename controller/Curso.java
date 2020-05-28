package controller;

import java.util.ArrayList;
import model.LeiaCsv;

public class Curso extends LeiaCsv{
	
	public ArrayList<String[]> listaTodosCursos(){
		//LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "src/arquivos_csv/cursos.csv";		
		ArrayList<String[]> cursos = leitura(csvPath);
		return cursos;
	}
}
