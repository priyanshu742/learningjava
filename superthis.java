import tools.A;
import tools.B;
import tools.C;

class D extends A // SUB CLASS
{
    public D()
    {
        super(77);  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in D");
    }

    public D(int n)
    {
        super(63);  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in D int");  
    }    
}

class E extends A // SUB CLASS
{
    public E()
    {
        super();  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in E ");
    }

    public E(int n)
    {
        this();  // calls the constructor of the same class
        System.out.println("in E int");  
    }    
}

@SuppressWarnings("unused")


public class superthis 
{
    public static void main(String args[]) 
    {
        B obj= new B();

        System.out.println();

        B obj1= new B(5);

        System.out.println();

        C obj3= new C(9);

        System.out.println();

        D obj4= new D();

        System.out.println();

        E obj5= new E(55);      
    }     
}


/*output

in A
in B

in A
in B int

in A int 
in C int

in A int 
in D

in A
in E 
in E int

[Done] exited with code=0 in 0.226 seconds
    
*/