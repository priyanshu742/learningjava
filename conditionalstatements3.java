
@SuppressWarnings("unused")


public class conditionalstatements3
{
    public static void main(String arg[])
    {
        int a=18;
        if(a>10)
            System.out.println("hit"); // only if ; no curly braces needed for single statement

        int b=20;
        if(true)
            System.out.println("potato"); // only if 

        int c=20;   
        if(false)
            System.out.println("dark"); // only if 

        int d=18;
        if(d>10 && d<20)
            System.out.println("apple"); // only if

        int e=8;
        if(e>10)
            System.out.println("maggi");
        else
            System.out.println("miss"); // if else without using curly braces; not needed for single statement

        int f=73;    
        if(f>50)
           {
                System.out.println("start");
                System.out.println("now");
           }
        else
            {
                System.out.println("end");
                System.out.println("it"); // if else  using curly braces for more than one statement;
            }

        int g=10;
        int h=20;
        if(g>h)
        {
            System.out.println(g);
            System.out.println("is greater");
        }
        else
        {
            System.out.println(h);
            System.out.println("is greater");
        }

        int i=10;
        int j=72;
        int k=26;
        if(i>j && i>k)            // if else if statement to find the largest number among 3 numbers
        {
            System.out.println(i + " is larger than j and k");
        }
        else if(j>i && j>k) // else if(j>k) is also correct becuase i is already checked in the first if statement and its not greater than j thats why we are in the 2nd condition
        {
            System.out.println(j + " is larger than i and k");
        }
        else
        {
            System.out.println(k + " is larger than i and j");
        }
    }
}

/* output


[Running] cd "/Users/priyanshusingh/javacourse/" && javac conditionalstatements3.java && java conditionalstatements3
hit
potato
apple
miss
start
now
20
is greater
72 is larger than i and k

[Done] exited with code=0 in 0.238 seconds

*/