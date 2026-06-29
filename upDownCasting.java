

import tools.A;
import tools.B;

public class upDownCasting 
{
    public static void main(String args[]) 
    {
        A obj=(A) new B(); // upcasting ; automically happens in this case ; implicit
        obj.show1();

        B obj1=(B)obj; // downcasting ; explicit
        obj1.show2(); // not possible before   
    }  
}

/* ouput

in A (DUE TO CONSTRUCTOR)
in B (DUE TO CONSTRUCTOR)
in A show1
in B show2

*/
