import tools.Laptop;
import tools.Comp;

class Desktop implements Comp
{
     public void Code() 
    {
        System.out.println("code,compile,run : FASTER");
    }
}

class Developer 
{
    public void DevApp(Comp device)
    {
        device.Code();
    }
}

public class needOfInterface 
{
    public static void main(String[] args) 
    {
        Comp lap=new Laptop(); // interface refernce ; not class refernce
        Comp desk= new Desktop();  // interface refernce  ; not class refernce


        Developer priyanshu= new Developer();
        priyanshu.DevApp(lap);
        priyanshu.DevApp(desk);     
    }
}

/* output


[Running] cd "/Users/priyanshusingh/javacourse/" && javac needOfInterface.java && java needOfInterface
code,compile,run
code,compile,run : FASTER

*/
