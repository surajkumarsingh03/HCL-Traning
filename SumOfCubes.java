//WAP to return the difference between sum of cube of n and m and 
//sum of square of n and m
import java.util.Scanner;
public class SumOfCubes {
	public static int difference(int n, int m) {
		int cube=(n*n*n) + (m*m*m);
		int square=(n*n) + (m*m);
		int diffrence=cube - square;
		System.out.println("the difference between sum of cube and  sum of square of " + n + " and "  +m+ " is : " +diffrence);
		System.out.println(diffrence);
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("Enter the value of m: ");
		int m=sc.nextInt();
		difference( n,  m);
	}

}
