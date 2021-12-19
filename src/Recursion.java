import java.util.Scanner;

class Recursion {

    private final Scanner scan = new Scanner(System.in);

    public int sum(int count){
        System.out.print("Enter number: ");
        int userSum = scan.nextInt();
        
        // if counter equals up to 4 indexes return userSum  
        if(count == 4) {
            scan.close();
            return userSum;
        }
        // else keep counting 
        count++; 
		// It takes the current value and makes a call to itself with the new count 
		// (thus asking the user for a new number and so forth). 
        return userSum + sum(count);
    }

    public static void main(String[] args)
    {
    	// creating a recursion object
    	Recursion recursionObject = new Recursion();
    	
		// calls sum on the recursionObject with the initial count value of 0
    	// so that the value does not affect the count 
    	int total = recursionObject.sum(0);

        System.out.println("The total sum is: "+ total);
       
        System.out.println("Scanner Closed.");
    }

}


//References
//https://www.w3schools.com/java/java_classes.asp
//https://www.geeksforgeeks.org/arrays-in-java/
//https://stackoverflow.com/questions/70400733/not-able-to-calculate-sum-in-recursive-java-function?noredirect=1#comment124448102_70400733

