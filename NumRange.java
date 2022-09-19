//WAP to return the numbers of integer in the range of (a-b),
//where numbers which are divisible by given number a


import java.util.Scanner;
public class NumRange {
	public static int numbers(int a , int b) {
	for(int i=a;i<=b;i++) {
		if(i % a==0) {
	        System.out.println( "Numbers which are divisible by given number " +a+ " is : "+i);
	  }
	}
		return a;
	       
	     }
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		numbers(a,b);
				
	}

}
