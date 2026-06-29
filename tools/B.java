

package tools;
public class B extends A // SUB CLASS
{
    public B()
    {
        super();  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in B");
    }

    public B(int n)
    {
        super();  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in B int"); 
    }

    public void show()
    {
        System.out.println("in B show");
    }

    public void show2()
    {
        System.out.println("in B show2");
    }
    
}  
    

