//WAP to return sum of squares of numbers in range (1-n)
//1^2+2^2+3^2=14

import java.util.Scanner;
public class SquareNum {
	public static int sum(int n) {
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum +=i*i;
		}
		System.out.println("sum of squares of numbers is : " + sum);
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		sum(n);
	 
				
	}

}
