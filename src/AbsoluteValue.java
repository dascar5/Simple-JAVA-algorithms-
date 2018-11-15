import java.util.Scanner;
public class AbsoluteValue {
	public static void main (String []args){
		int N, N1;
		Scanner s=new Scanner(System.in);
		System.out.println("Unesi cijeli broj N: ");
		N=s.nextInt();
		
		if (N<0)
			N1=-N;
		else
			N1=N;
			
		//N1=Math.abs(N);
		System.out.println("|"+ N + "|="+N1);
		}
}
// Apsolutna vrijednost broja, mnogo lakse sa math metodom