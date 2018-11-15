import java.util.Scanner;
public class OddOrNot {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("Unesite broj koji zelite da provjerite: ");
		x=s.nextInt();
		if(x%2==0)
			System.out.println("Vas broj je paran!");
		else
			System.out.println("Vas broj je neparan!");
	}
}
