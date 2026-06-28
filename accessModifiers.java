
import tools.K;

public class accessModifiers 
{
    public static void main(String args[]) 
    {
        System.out.println();
        System.out.println("DUE TO CONSTRUCTOR");
        K kobj=new K();
        System.out.println("DUE TO CONSTRUCTOR");
        System.out.println();


        // DEFAULT
        // System.out.println(kobj.standard); can't use default access modifier in different package 
        System.out.println("DEFAULT ( ACCESS MODIFIER ) DENIED");

        //PUBLIC
        System.out.println(kobj.age + "  PUBLIC "); // public access modifier can be accessed anywhere

        // PRIVATE
        // System.out.println(kobj.name); can't use private access modifier in any different class
        System.out.println("PRIVATE ( ACCESS MODIFIER ) DENIED");

        // PROTECTED
        // System.out.println(kobj.sub); can't use protected access modifier in different package non-subclass
        System.out.println("PROTECTED ( ACCESS MODIFIER ) DENIED");



        System.out.println();
        System.out.println("DUE TO SUPER KEYWORD IN  B CONSTRUCTOR");
        L lobj=new L();
        System.out.println("DUE TO SUPER KEYWORD IN B CONSTRUCTOR");
        System.out.println();

        // DEFAULT
        System.out.println(lobj.color + "  DEFAULT");//  default access modifier can be used in same package 

        //PUBLIC
        System.out.println(lobj.size + "  PUBLIC"); // public access modifier can be accessed anywhere

        // PRIVATE
        // System.out.println(bobj.model);can't use private access modifier in any different class
        System.out.println("PRIVATE ( ACCESS MODIFIER ) DENIED");
        
        // PROTECTED
        System.out.println(lobj.price +  "  PROTECTED"); // protected access modifier can be used in same package     
    }  
}

/* Output

DUE TO CONSTRUCTOR
object created
DUE TO CONSTRUCTOR

DEFAULT ( ACCESS MODIFIER ) DENIED
17  PUBLIC 
PRIVATE ( ACCESS MODIFIER ) DENIED
PROTECTED ( ACCESS MODIFIER ) DENIED

DUE TO SUPER KEYWORD IN  B CONSTRUCTOR
in A
in B
DUE TO SUPER KEYWORD IN B CONSTRUCTOR

Blue  DEFAULT
35  PUBLIC
PRIVATE ( ACCESS MODIFIER ) DENIED
1000  PROTECTED

[Done] exited with code=0 in 0.236 seconds

 */