import java.util.Scanner;


public class EsPrimoTeclado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		long n = Long.parseLong( teclado.nextLine() );
		
		long i = 2L;
		
		while ( (n%i) != 0){
			i++;
		}
		if (n==i){
			System.out.println(n+" es número primo");
		}else{
			System.out.println(n+" no es un número primo");
		}
	}

}
