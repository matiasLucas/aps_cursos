package controller;

import java.util.ArrayList;
import model.LeiaCsv;

public class Curso {
	
	public ArrayList<String[]> listaTodosCursos(){
		LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "C:\\Users\\teixe\\OneDrive\\Documentos\\01\\cursos.csv";		
		ArrayList<String[]> cursos = objLerCsv.leitura(csvPath);
		return cursos;
	}
}
