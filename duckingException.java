
class Except 
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("CALC");
    }
}

public class duckingException 
{
    public static void main(String[] args) 
    {
        System.out.println("hello");

        Except obj = new Except();
        try
        {
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found" + e);
        }  
    }
}
