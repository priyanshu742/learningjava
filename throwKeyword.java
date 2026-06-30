

public class throwKeyword 
{
    public static void main(String[] args) 
    {
        int i=20;
        int j=99;

        try
        {
            j=18/i;
            if (j==0)
                throw new ArithmeticException(" cannot divide by zero");
        }

        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("thats the default output" + e);
        }
       
        catch(Exception e) // parent class at the end
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);

        System.out.println("Bye");  
    }  
}

/*output

thats the default outputjava.lang.ArithmeticException:  cannot divide by zero
18
Bye

*/
