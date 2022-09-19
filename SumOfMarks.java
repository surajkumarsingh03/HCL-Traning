//WAP to return the sum of marks (a,b,c)
//Assumptions:
//I: a>=0, b>=0, c>=0
//II: passing marks: >=40
//III: Return the sum of marks if it is >=40
import java.util.Scanner;
public class SumOfMarks {
	public static int sumOfMarks(int a, int b, int c) {
		int sum = 0;
		if(a>=0 && b>=0 && c>=0) {
			sum =sum + a + b + c;
		}
			if(sum>=40) {
				System.out.println("Sum of marks is: "+sum+ " --you are passed ");
			}
			else {
				System.out.println("Sum of marks is less than 40: "+sum+ " --retry again");
			}
			return 0;
		
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a= sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b= sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c= sc.nextInt();
		sumOfMarks(a, b, c);
	}

}
