abstract class lori
{
    abstract public void show();
    abstract public void judith();
}

public class abstractAnonymousInnerClass 
{
    public static void main(String args[]) 
    {
        lori l =new lori() // object of AnonymousInnerClass (CANNOT CREATE OBJECT OF ABSTRACT CLASS)
        {

            public void show() // anonymous inner class
            {
                System.out.println("in lori");
            } 

            public void judith()
            {
                System.out.println("in judith");
            } 
        };
        l.show();
        l.judith();    
    }   
}

/*output

in lori
in judith

*/
