
class priyanshuException extends Exception
{
    public priyanshuException(String str)
    {
        super(str);
    }
}
public class ownException 
{
    public static void main(String[] args) 
    {
        int i=20;
        int j=99;

        //separate try catch block for class.forName() method

        try
        {
            Class.forName("Comp");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found" + e);
        }

        try
        {
            j=18/i;
            if (j==0)
                throw new priyanshuException(" NOT IN MOOD RN");
        }

         catch(priyanshuException e)
        {
            j=18/2;
            System.out.println("Something went wrong .." + e);
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
