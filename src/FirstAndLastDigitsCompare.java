import java.util.Scanner;
public class FirstAndLastDigitsCompare {
	public static void main (String []args){
		Scanner s=new Scanner(System.in);
		int N,N1,cifNajV, cifNajM;
		System.out.println("Unesi N: ");
		N=s.nextInt();
		N1=N;
		cifNajM=N%10;
		cifNajV=cifNajM;
		while (N>0){
			cifNajV=N%10;
			N/=10;
		}
		if(cifNajM==cifNajV)
			System.out.println("Cifre najmanje i najvece tezine broja " + N1 + " su jednake.");
		else
			System.out.println("Cifre najmanje i najvece tezine broja " + N1 + " nisu jednake.");
	}

}
