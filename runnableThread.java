

public class runnableThread 
{
    public static void main(String[] args) 
    {
        Runnable m3= () -> // runnable interface is a functional interface so we can use lambda expression to implement it
            {
                for(int i=1;i<=5;i++)
                {
                    System.out.println(" hi " + i);
                    try 
                    {
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e) 
                    {
                         e.printStackTrace();
                    } 
                }
            };
    
        Runnable m4= () -> 
            {
                for(int i=1;i<=5;i++)
                {
                    System.out.println(" hello " +i);
                    try
                    {
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e) 
                    {
                         e.printStackTrace();
                    }

                }
            
            };

        Thread t1=new Thread(m3);
        Thread t2=new Thread(m4);

        t1.start();
        t2.start();
    }     
}

/* output

hi 1
 hello 1
 hi 2
 hello 2
 hi 3
 hello 3
 hi 4
 hello 4
 hello 5
 hi 5

[Done] exited with code=0 in 0.302 seconds

*/
