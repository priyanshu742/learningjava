public class multipleTryCatch
{
    public static void main(String[] args) 
    {
        int i=5;
        int j=99;

        int num[]=new int[5];
        num[0]=22;
        num[1]=32;
        num[2]=42;
        num[3]=52;
        num[4]=62;

        String str= null;

        try
        {
            j=18/i;
            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("OUT OF INDEX");
        }
        catch(Exception e) // parent class at the end
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);

        System.out.println("Bye");  
    }  
}

/*ouput

Something went wrong...java.lang.NullPointerException: Cannot invoke "String.length()" because "<local4>" is null
3
Bye


*/



/* output without  System.out.println(str.length());

32
OUT OF INDEX
3
Bye

*/
    
