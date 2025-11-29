package Arvore;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		

		Scanner sc = new Scanner(System.in);

			int N = 0;
			N = Integer.parseInt(sc.nextLine());
			
			for(int i = 1; i<=N; i+=2) {
				int espaco = (N - i) / 2;

				for (int j = 0; j < espaco; j++) {System.out.print(" ");}
				for(int j = 1; j<=i; j++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
			
			int espacot = (N - 1) / 2;
	        for (int j = 0; j < espacot; j++) System.out.print(" ");
			System.out.printf("*");
			System.out.printf("\n");
			
			
			int espacoT = (N - 3) / 2;
	        for (int j = 0; j < espacoT; j++) System.out.print(" ");
			System.out.printf("***");


		
	}
	
}
