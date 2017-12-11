
public class HiloCuentaAtras extends Thread {

	private Contador contador;

	public void run() {
		for(int i = 0; i<contador.getNumero();i++){
			System.out.println(contador.getNumero()-i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public HiloCuentaAtras(Contador contador) {
		super();
		this.contador = contador;
	}
	
}
