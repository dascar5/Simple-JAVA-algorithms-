import java.util.Scanner;
public class Factoriel {
	public static void main (String []args){
	double i=1;
	double fakt=1;  //double zato sto faktorijel moze biti ogroman broj
	  int broj;
	  System.out.println("Unesite broj od koga zelite da znate faktorijel: ");
	  Scanner s=new Scanner(System.in);
	  broj=s.nextInt();
	  for(i=2;i<=broj;i++){ //pocinje od 2 jer za 1 nema faktorijel   
	      fakt=fakt*i;    
	  }    
	  System.out.println("Faktorijal od "+broj+" je: "+fakt);    
	  } 
	}


