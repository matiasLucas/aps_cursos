package model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InserirCsv{

	public void escreverArquivo(String arq, String str1, String str2, String str3 )
		throws IOException {
		boolean anexar = false;
		File f = new File(arq);
		if (f.length() != 0L)
		anexar = true;
		FileWriter writer = new FileWriter(new File(arq), anexar);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		LeiaCsv lc = new LeiaCsv();
		ArrayList<String[]> resposta = lc.leitura(arq);		
		
        for(String[] linha: resposta) {
			for(String elemento : linha) {
				bufferedWriter.write(str1);
				bufferedWriter.write(str2);				
			}	
        }
        
    	writer.close();
    	bufferedWriter.close();
    }  
   
}
