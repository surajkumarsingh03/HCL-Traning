//WAP to return the count of numbers from 1 to n, The numbers which are divisible by either 5 or 7
import java.util.*;
import java.util.Scanner;
public class Divisibleby5And7 {
	public static int count(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%5==0 || i%7==0) {
				count++;
				}
		}
		System.out.println("count of numbers from 1 to n,that 5are divisible by either 5 or 7 is : " + count);
		return count;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		
		count(n);
	}

}
