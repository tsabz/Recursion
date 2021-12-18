import java.util.Scanner;

class Recursion {

    private final Scanner scan = new Scanner(System.in);

    public int sum(int count){
        System.out.print("Enter any number: ");
        int userSum = scan.nextInt();
        if(count == 4) {
            scan.close();
            return userSum;
        }
        count++;

        return userSum + sum(count);
    }

    public static void main(String[] args)
    {
       Recursion r = new Recursion();

       int sumNum =  r.sum(0);

        System.out.println("The sum of digits is: "+sumNum);
        System.out.println("Scanner Closed.");
    }

}






//public class Recursion {
//	
//	public static int Recursion1(int userSum) 
//	{
//		
//		if (userSum == 0) {
//			return userSum;
//			} else {
//			return userSum + Recursion1(userSum - 1);
//			}
//
//	}		
//	
//	public static void main(String[] args) 
//	{
//		System.out.println("Program Started");
//		
//		int userSum = 0;
//		int i;
//		Scanner scan = new Scanner(System.in);
//		
//		for(i=0;i < 5;i++) {
//
//			//ask user input 
//			 
//			 System.out.print("Enter any number: ");
//			 userSum = scan.nextInt();
//		}
//	      scan.close();
//	      int sumNum=Recursion1(userSum);
//	      System.out.println("The sum of digits is: "+sumNum);
//	      System.out.println("Scanner Closed.");
//	}
//
//}
