

public class exceptionHandling 
{
    public static void main(String[] args) 
    {
        int i=0;
        int j=99;

        try
        {
            j=18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);

         System.out.println("Bye");  
    }  
}

/* output

Something went wrong...java.lang.ArithmeticException: / by zero
99
Bye


*/
