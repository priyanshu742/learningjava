class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public void config()
    {
        System.out.println(" in A config");
    }

}

class Advcalc extends Calc
{
    public int add(int n1,int n2) // method overriding
    {
        return n1+n2+1;
    }
}

public class methodoverriding 
{
    public static void main(String args[]) 
    {
        Advcalc h= new Advcalc();
        int r1=h.add(9,9);
        System.out.println(r1);   
    } 
}
/* output

19

 */
