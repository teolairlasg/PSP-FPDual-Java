
public class EsPrimo {
	
	public static void main(String[] args) {
		
		long n = Long.parseLong(args[0]);
		
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
