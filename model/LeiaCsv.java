package model;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeiaCsv {
	public static void main(String[] args) {
		LeiaCsv objLerCsv = new LeiaCsv();
		String csvPath = "C:\\Users\\teixe\\OneDrive\\Documentos\\01\\alunos.csv";
		ArrayList<?> ret = objLerCsv.leitura(csvPath);
	   // System.out.println("Aluno [id= " + ret[ret.length-2] 
         //                  + " , nome=" + ret[ret.length-1] + "]");
		System.out.println(ret);
	}
	
	public ArrayList<ArrayList<String>> leitura(String arquivoCSV) {
		BufferedReader br = null;
	    String linha = "";
	    String[] aluno = null;
	    ArrayList<String> l1 = new ArrayList<String>();
	    ArrayList<String> l2 = new ArrayList<String>();
	    ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();

	    try {
		        br = new BufferedReader(new FileReader(arquivoCSV));
		        while ((linha = br.readLine()) != null) {
		            aluno = linha.split(";");
		            l1.add(aluno[aluno.length-2]);
		            l2.add(aluno[aluno.length-1]);          
		          }
		        ret.add(l1);
	            ret.add(l2);  
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
		    return ret; 
	}
}
