import java.util.Scanner;
public class Functionfx {
	public static void main (String[]args){
		int x;
		float f;
		Scanner s=new Scanner(System.in);
		System.out.println("Unesite varijablu: ");
		x=s.nextInt();
		
		if(x<1)
			f=x*x;
		else if(x>=1 && x<5)
			f=2-x;
		else f=(float)(x*x*x-1)/5; //float stavljen za decimale, kastovano
		System.out.println("Resenje funkcije je :" +f);
		s.close(); //zatvaranje skenera, nepotrebno
	}
}
//float zato sto resenje funkcije f moze da bude decimala