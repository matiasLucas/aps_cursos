package model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeiaCsv {

	public ArrayList<String[]> leitura(String arquivoCSV) {
		BufferedReader br = null;
	    String linha = "";
	    String[] split = null;
	    ArrayList<String[]> ret = new ArrayList<String[]>();

	    try {
		        br = new BufferedReader(new FileReader(arquivoCSV));
		        while ((linha = br.readLine()) != null) {		        
		           split = linha.split(";");
		           ret.add(split);
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
		    return ret; 
	}
}