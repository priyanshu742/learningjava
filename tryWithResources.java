

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class tryWithResources 
{
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        int i=0;
        int j=66;

        try
        {
            j=18/i;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Something went wrong..." + e);
        }
        finally // finally block will always execute whether exception occurs or not
        {
            System.out.println("Bye");
        }

        /* taking input through try

        int num=0;
        BufferedReader  br=null;
        try
        {
            System.out.println("Enter a number");
            InputStreamReader isr= new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally
        {
            br.close();
        }  

        */

        // try with resources (java 7 feature) automatically closes the resource after use
        int num=0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
            System.out.println("Enter a number");
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
/*output 


Something went wrong...java.lang.ArithmeticException: / by zero
Bye
Enter a number
87
87


*/
