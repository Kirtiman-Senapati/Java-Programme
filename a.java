import java.util.Scanner;
public class a
{  
    public static void main(String[] args) 
    {
        int year;
        System.out.println("enter year");
        try (Scanner input = new Scanner (System.in)) 
        {
            year=input.nextInt();
        }
        if(year %4==0)
        { 
            System.out.println(" leap year");
        }    
        else 
        {
           System.out.println("normal year");
        }
    }    
}      
