

// final keyword can be used with a variable,method or a class



final class formulas // restricts inheritance ; now no other class can extend formulas
{
    public void basic()
    {
        System.out.println("All the basic formula");
    }

}

class integrator 
{
    public void functions()
    {
        System.out.println("performs integration");
    }
    public final void inventor() // restricts methodOverriding; now no other method can have the same method name
    {
        System.out.println("by priyanshu");
    }
    public void integ(int n)
    {
        System.out.println("performed integration of " + n);
    } 
}

class advintegrator extends integrator
{
    public void functions()
    {
        System.out.println("performs integration");
    }
}

public class finalkeyword
{
    public static void main(String args[]) 
    {
        final int num=68; // this value can no longer be modified ; acting as a constant
        System.out.println(num);

        advintegrator adv= new advintegrator();
        adv.inventor();
        adv.integ(1);

        formulas f= new formulas();
        f.basic();   
    } 
}
 
/*output

[Running] cd "/Users/priyanshusingh/javacourse/" && javac finalkeyword.java && java finalkeyword
68
by priyanshu
performed integration of 1
All the basic formula


*/
