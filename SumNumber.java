//WAP to return the sum of integer in the range of (a-b),
	//where numbers which are divisible by given number n


import java.util.Scanner;
public class SumNumber {
		public static int numbers(int a , int b,int n) {
			int sum=0;
		for(int i=a;i<=b;i++) {
			if(i % n==0) {
		       sum +=i;
		  }
		}
		System.out.println("Numbers which are divisible by given number " + n + " is: " +sum);
			return 0;
		 }
		
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			int b=sc.nextInt();
			System.out.println("Enter the value of n:");
			int n=sc.nextInt();
			numbers(a,b,n);
					
		}

	}


