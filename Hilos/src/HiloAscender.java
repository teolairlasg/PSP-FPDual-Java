
public class HiloAscender extends Thread {
	
	Contador contador;

	public HiloAscender(Contador contador){
		this.contador = contador;
	}
	
	public void run() {
		for(int i = 0; i<300;i++){
			contador.incrementar();
		}
		System.out.println("Ascendido 300");
	}
	
	

}
