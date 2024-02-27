
import java.util.Scanner;
public class Palindrom {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String rev="";
        System.out.println("Enter the value of the String:");
        String org=sc.nextLine();
        
        for(int i=org.length()-1;i>=0;i--)
        {
           rev+=org.charAt(i);
        }
        if(org.equals(rev))
        {
            System.out.println("Palindrom");
        }   
        else
        {
            System.out.println("Not Palindrom");
        }
        
    }
}