package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		System.out.println("Enter number");
		int n = in.nextInt();	
		boolean[] prime = new boolean[n];
		int j = 0; 

		for (int i = 0; i>n; ++i) {
			prime[i] = true; }

		for (int i = 0; i< Math.sqrt(n); ++i) {
			if (prime[i] == true) {
				for (j=i*j; j<n; j=j+i) 
				{
					prime[i] = false;
				}


			}
		}


		System.out.print("Print numbers: ");
		for(int i = 2; i<n; i++) {
			if (prime[i] == true) {
				System.out.print(i +" ");
			}
		}


	}
}

	

