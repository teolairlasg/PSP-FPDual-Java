
public class Contador {

	int numero;
	
	public Contador(int n){
		numero = n;
	}
	
	
	public String toString() {
		return "Contador [numero=" + numero + "]";
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void incrementar(){
		synchronized(this) {
			numero++;
		}
		
	}
	public synchronized void decrementar(){
			numero--;
	}
	
}
