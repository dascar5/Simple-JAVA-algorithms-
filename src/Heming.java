import java.util.Scanner;
public class Heming {
	
	public static void main(String[]args){
		int N;
		Scanner u= new Scanner(System.in);
		System.out.println("Unesite N");
		N=u.nextInt();
		//Odredjivanje da li je Hemingov
		while (N%2==0)N=N/2;
		while (N%3==0)N=N/3;
		while (N%5==0)N=N/5;
		
		if(N==1)
			System.out.println("Jeste Hemingov");
		else
			System.out.println("Nije Hemingov");
	}

}
