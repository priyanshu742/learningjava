import tools.A;
import tools.B;
import tools.C;

public class dynamicMethodDispatch 
{
    public static void main(String[] args)
    {
        // run time polymorphism
        A obj=new A();
        obj.show();

        System.out.println();

        obj=new B();
        obj.show();

        System.out.println();

        obj=new C();
        obj.show();   
    }   
}

/* output

in A (DUE TO CONSTRUCTOR)
in A show

in A (DUE TO CONSTRUCTOR)
in B (DUE TO CONSTRUCTOR)
in B show

in A (DUE TO CONSTRUCTOR)
in C (DUE TO CONSTRUCTOR)
in C show 

[Done] exited with code=0 in 0.224 seconds


 */
