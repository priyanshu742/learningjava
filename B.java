

public class B extends A // SUB CLASS
{
    String color="Blue";
    public int  size=35;
    private String model="luxury";
    protected int price=1000;

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
}  
    

