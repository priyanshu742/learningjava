package tools;

public class A extends Object
{
    public A() // SUPER CLASS
    {
        super();  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in A");
    }

    public A(int n)
    {
        super();  // PRESENT BY DEFFAULT ; calls the constructor of the super class
        System.out.println("in A int ");  
    }
    public void show() 
    {
        System.out.println("in A show");
    }

     public void show1() 
    {
        System.out.println("in A show1");
    }
}
    

