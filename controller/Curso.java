package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.InserirCsv;
import model.LeiaCsv;

public class Curso extends LeiaCsv{
	
	private String nome;
	private String nivel;
	private String ano;
	
	public Curso() {
		
	}
	
	public Curso(String nome, String nivel, String ano) {
		this.setNome(nome);
		this.setNivel(nivel);
		this.setAno(ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public ArrayList<String[]> listaTodosCursos(){
		//LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "src/arquivos_csv/cursos.csv";		
		ArrayList<String[]> cursos = leitura(csvPath);
		return cursos;
	}
	
	public void cadastrarCurso() {
		String csvPath = "src/arquivos_csv/cursos.csv";	
		InserirCsv ic = new InserirCsv();
		try {
			ic.escreverArquivo(csvPath,this.nome,this.nivel,this.ano);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
