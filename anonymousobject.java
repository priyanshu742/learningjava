

import tools.K;



public class anonymousobject 
{
    public static void main(String args []) 
    {
        new K(); // anonymous object created (it does not have any reference{name})
        new K().show(); // new object created
        new K().show(); // again new object created   
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
