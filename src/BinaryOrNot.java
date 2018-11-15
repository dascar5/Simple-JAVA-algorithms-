import java.util.Scanner;
public class BinaryOrNot {

	public static void main(String[] args) {
	Scanner u=new Scanner(System.in);
	int N;
	System.out.println("Unesite broj: ");
	N=u.nextInt();
	if(N%10 !=0 & N%10 !=1)
		System.out.println("Ne moze biti binarni");
	else
		System.out.println("Moze biti binarni");
	
	
	}

}
	/*public static void main(String[] args)
	{
	// Deklaracija promjenljivih i inicijalizacija vrijednosti
	int N, pom;
	boolean ind = true;
	Scanner u = new Scanner(System.in);
	// Unos N-a
	System.out.println("Unesi N: ");
	N = u.nextInt();
	// Rastavljanje broja na cifre
	pom = N;
	while (pom > 1)
	{
	if (pom%10 != 0 & pom%10 != 1)
	{
	ind = false;
	break;
	}
	pom = pom/10;
	}
	// Ispis rezultata
	if (ind)
	System.out.printf("Broj %d moze biti binaran broj.", N);
	else
	System.out.printf("Broj %d ne moze biti binaran broj.", N);
	}
	}
*/