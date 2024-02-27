import java.util.Scanner;
public class GCD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the first number");
        int a=sc.nextInt();
        System.out.println("Enter the value of the second number");
        int b=sc.nextInt();
        while(a%b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("The GCD is"+b);
}
}
