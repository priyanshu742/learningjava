
enum status
{
    Running,Pending,Success,Failed;
}

public class enumeration 
{
    public static void main(String args[]) 
    {
        status s= status.Running;

        System.out.println(s.getClass().getSuperclass()); // automatically extends this class

        System.out.println(s);
        System.out.println(s.ordinal());

        System.out.println();

        status s1= status.Failed;
        System.out.println(s1);
        System.out.println(s1.ordinal());

        System.out.println();

        status[] s2= status.values();
        System.out.println(s2);
        System.out.println(s2[0]);

        System.out.println();

        for(status k : s2)  // enhanced for loop
        {
            System.out.println(k+ " : " + k.ordinal());
        }

        System.out.println();

        // trying if else statements with enum

        status s3= status.Pending;
        if(s3==status.Running)
            System.out.println("ALL GOOD");
        else if(s3==status.Pending)
            System.out.println("PLEASE WAIT");
        else if(s3==status.Success)
            System.out.println("DONE");
        else 
            System.out.println("TRY AGAIN");

        // trying switch statements with enum

        status s4= status.Success;
        switch(s4) // creates a new file as enumeration$1.class
        {
            case Running:
                System.out.println("ALL GOOD");
                break;
            case Pending:
                System.out.println("PLEASE WAIT");
                break;
            case Success:
                System.out.println("DONE");
                break;
            case Failed:
                System.out.println("TRY AGAIN");
                break;
        }  
    }  
}

/*output


class java.lang.Enum
Running
0

Failed
3

[Lstatus;@1dbd16a6
Running

Running : 0
Pending : 1
Success : 2
Failed : 3

PLEASE WAIT
DONE

[Done] exited with code=0 in 0.263 seconds


*/
