
public class C extends A // SUB CLASS
{
    public C()
    {
        super();  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in C");
    }

    public C(int n)
    {
        super(8);  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in C int");  
    } 
    
    public void show()
    {
        System.out.println("in C show");
    } 
}


