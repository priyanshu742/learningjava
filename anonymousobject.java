

import tools.A1;



public class anonymousobject 
{
    public static void main(String args []) 
    {
        new A1(); // anonymous object created (it does not have any reference{name})
        new A1().show(); // new object created
        new A1().show(); // again new object created   
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
