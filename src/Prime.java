import java.util.Scanner;
public class Prime {
	public static void main(String[]args){
		Scanner u = new Scanner(System.in);
		int N;
		boolean ind=true;
		System.out.println("Unesite broj: ");
		N=u.nextInt();
		for(int i=2; i<N ; i++)
			if(N%i==0){
				ind=false;
				break;
			}
		if (ind)
			System.out.println("Broj je prost");
		else
			System.out.println("Broj nije prost");
	}
}
