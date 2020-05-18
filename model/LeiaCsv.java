package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeiaCsv {
	public static void main(String[] args) {
		LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "C:\\Users\\teixe\\OneDrive\\Documentos\\01\\alunos.csv";
		objLerCsv.leitura(csvPath);
	}
	
	public void leitura(String arquivoCSV) {
		BufferedReader br = null;
	    String linha = "";
	    
		    try {
		        br = new BufferedReader(new FileReader(arquivoCSV));
		        while ((linha = br.readLine()) != null) {

		            String[] aluno = linha.split(";");

		            System.out.println("Aluno [id= " + aluno[aluno.length-2] 
		                                 + " , nome=" + aluno[aluno.length-1] + "]");
		        }
		    }catch (Exception e) {
		    	e.printStackTrace();
		        
		    } finally {
		        if (br != null) {
		            try {
		                br.close();
		            	} catch (IOException e) {
		            		e.printStackTrace();
		            }
		        }
		    }		
	}
}
