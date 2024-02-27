import java.util.Scanner;
public class SUMOFNATURALNUMBER {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the number");
        int n=sc.nextInt();
        int Sum=(n*(n+1))/2;
        System.out.println("The sum of natural number is"+Sum);
    }
}