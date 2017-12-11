import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Metodo1 {

	public static void main(String[] args) {
		
		Process p = null;
		Runtime entornoEjecucion = Runtime.getRuntime();
		
		try {
			String programa=("java -classpath ./bin EsPrimo 4");
			p = entornoEjecucion.exec(programa);
			
			InputStream is = p.getInputStream();
			InputStreamReader bis = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(bis);
			
			String linea;
			
			while( (linea=br.readLine()) != null){
				System.out.println(linea);
			}
			br.close();
			bis.close();
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hola");
	}
	
	
}
