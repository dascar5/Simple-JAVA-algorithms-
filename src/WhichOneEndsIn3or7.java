//Unijeti 5 brojeva i saznati koji od njih zavrsava sa 3 ili 7
import java.util.Scanner;
public class WhichOneEndsIn3or7 {
		public static void main(String[]args){
			Scanner u= new Scanner(System.in);
			int br=0,i,broj;
			// br je broj cifara koji pogadjaju zahtjev za 3 i 7, i je brojac a broj je scanner unos
			
			System.out.println("Unesi 5 brojeva sa tastature: ");
			for(i=0;i<5;i++){
				broj=u.nextInt();
				if(broj%10==3 || broj%10==7){
					br++;
				}
			}
			//Ne zaboraviti da se print funkcija izbaci iz loop-a!
			System.out.println("Broj brojeva sa zadnjom cifrom 3 ili 7 je: " +br);
		}
}