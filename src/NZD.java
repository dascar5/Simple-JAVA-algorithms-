import java.util.Scanner;
public class NZD {

	public static void main(String[] args) {
		int m,n;
		Scanner u= new Scanner(System.in);
		//Unos brojeva
		System.out.println("Unesi m");
		m=u.nextInt();
		System.out.println("Unesi n");
		n=u.nextInt();
		
		//Odredjivanje NZD-a
		while(m!=n)
			if(m>n)
				m=m-n;
			else
				n=n-m;
		
		System.out.printf("NZD je %d.", m);
		

	}

}
