
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

/*ouput

[Running] cd "/Users/priyanshusingh/javacourse/" && javac annotations.java && java annotations

DUE TO CONSTRUCTOR
in A
in B
DUE TO CONSTRUCTOR

in B show

[Done] exited with code=0 in 0.225 seconds


*/
