//Write a program to calculate the monthly telephone bills as per the following rule: 
//
//	Minimum Rs. 200 for upto 100 calls. 
//	Plus Rs. 0.60 per call for next 50 calls. 
//	Plus Rs. 0.50 per call for next 50 calls. 
//	Plus Rs. 0.40 per call for any call beyond 200 calls
//	
//	Test Cases:
//	
//	Input		Output
//	180			245
//	200			255
//	210			259

import java.util.Scanner; 
public class calculateBill {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			int calls;
			float amount;
			System.out.println("Enter the total number of calls:");
			calls = sc.nextInt();
			if(calls <=100) {
				amount = 200;
			}
			else if(calls<=150) {
				amount = 200+(calls-100)*0.6f;/// 100-->200  50--(calls-100)*0.6f
				}
			else if(calls<=200) {
				amount = 200+(50*0.6f)+(calls-150)*0.5f;//100-->200 + 50-->(50*0.6f) + remning 50-->(calls-150)*0.5f
				}
			else {
				amount=200+ (50*.6f) + (50*.5f) + (calls-200) * .4f;
			}
			System.out.println("The total amount is:" +amount);
		}
	} 



