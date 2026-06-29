class rick
{
    public void show()
    {
        System.out.println(" in rick");
    }
}

public class anonymousInnerClass 
{
    public static void main(String args[])
    {
        rick r=new rick()
        {
            public void show() // anonymous inner class
            {
                 System.out.println(" in  new rick");
            }
        };
        r.show(); 
    }  
}

/*ouput

 in  new rick
 
 */
