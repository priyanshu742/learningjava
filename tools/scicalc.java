package tools;

// JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE



// child for advcalc

public class scicalc extends advcalc // multi level inheritance
{
    public double pow(int n1,int n2)
    {
        return  Math.pow(n1, n2);
    }
    
    public double root(int n1)
    {
        return  Math.sqrt(n1);
    }
    
}
