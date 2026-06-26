class A
{
    public A() // constructor
    {
        System.out.println("object created");

    }
    public void show()
    {
        System.out.println("in a method");
    }
}




public class anonymousobject 
{
    public static void main(String args []) 
    {
        new A(); // anonymous object created (it does not have any reference{name})
        new A().show(); // new object created
        new A().show(); // again new object created   
    }  
}

// anonymous object cannont be reused

/* output

object created
object created
in a method
object created
in a method

*/
