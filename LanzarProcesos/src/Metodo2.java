import java.awt.List;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class Metodo2 {

	public static void main(String[] args) {
		
		String ficheroSalida = "/home/user/Fich.txt";
		
		File fSalida = new File(ficheroSalida);
		
		ProcessBuilder constructor = 
				new ProcessBuilder("java","EsPrimoTeclado", "38");
		constructor.directory(new File("./bin"));
		constructor.redirectOutput(fSalida);
		
		try {
			Process p = constructor.start();
			OutputStream os = p.getOutputStream();
			OutputStreamWriter bos= new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(bos);
			
			bw.append("961748941");
			bw.close();
			
			int exitVal = p.waitFor();
			System.out.println("Proceso terminado con valor: "+exitVal);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
