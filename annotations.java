
// ANNOTATIONS ARE USED TO CONTACT TO THR COMPILER DIRECTLY ; OR TO PROVIDE A SUPPLEMENT


import tools.A;
import tools.B;

@SuppressWarnings("unused") // annotation
public class annotations 
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("DUE TO CONSTRUCTOR");
        B obj=new B();
        System.out.println("DUE TO CONSTRUCTOR");
        System.out.println();

        obj.show();
    }  
}
