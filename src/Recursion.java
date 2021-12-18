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
