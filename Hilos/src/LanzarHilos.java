
public class LanzarHilos {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Contador cont = new Contador(1);
		HiloAscender ha = new HiloAscender(cont);
		HiloDescender hd = new HiloDescender(cont);
		
		ha.start();
		hd.start();
		Thread.sleep(1500);
		System.out.println(cont);
	}

}
