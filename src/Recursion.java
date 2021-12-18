import java.util.Scanner;

public class Recursion {
	
	public static int Recursion1(int userSum) 
	{
		
		if (userSum == 0) {
			return userSum;
			} else {
			return userSum + Recursion1(userSum - 1);
			}

	}		
	
	public static void main(String[] args) 
	{
		int userSum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program Started");
		
		System.out.println(Recursion1(userSum));
	
		int counter = 0;
		int i;
		
		for(i=0;i < 5;i++) {
			counter = counter + 1;
			System.out.println(counter);
			//ask user input 
			 
			 System.out.print("Enter any number: ");
			 userSum = scan.nextInt();
		}
	      scan.close();
	      int sumNum=Recursion1(userSum);
	      System.out.println("The sum of digits is: "+sumNum);
	      System.out.println("Scanner Closed.");
	}

}
