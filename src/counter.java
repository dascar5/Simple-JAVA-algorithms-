import java.util.Scanner;
public class counter {
	public static void main(String[]args){
		Scanner u=new Scanner(System.in);
		System.out.println("Unesite broj");
		String broj;
		broj=u.next();
		char jedinica = '1';
		char nula='0';
		int brojJedinica = 0;
		int brojNula= 0;
		  
		for (int i = 0; i < broj.length(); i++) {
		    if (broj.charAt(i) == jedinica) {
		        brojJedinica++;
		    }
		    if (broj.charAt(i)== nula){
		    	brojNula++;
		    }
		}
		System.out.printf("Broj jedinica u vasem broju je %d, dok je broj nula %d.",brojJedinica,brojNula);
		
}
}