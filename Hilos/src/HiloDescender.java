
public class HiloDescender extends Thread {

	Contador contador;

	public HiloDescender(Contador contador){
		this.contador = contador;
	}
	
	public void run() {
		for(int i = 0; i<300;i++){
			contador.decrementar();
		}
		System.out.println("Descendido 300");
	}
	
	

}
