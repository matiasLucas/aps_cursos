package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.InserirCsv;
import model.LeiaCsv;

public class Aluno extends LeiaCsv{

	private String id;
	private String nome;
	
	public Aluno() {
		
	}
	
	public Aluno(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<String[]> listaTodosAlunos(){
		String csvPath = "src/arquivos_csv/alunos.csv";		
		ArrayList<String[]> alunos = leitura(csvPath);
		return alunos;
	}
	
	public void cadastrarAluno() {
		String csvPath = "src/arquivos_csv/alunos.csv";	
		InserirCsv ic = new InserirCsv();
		try {
			ic.escreverArquivo(csvPath,this.id,this.nome,"");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
