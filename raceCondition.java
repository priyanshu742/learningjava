
class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}

public class raceCondition 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Counter c= new Counter();

        Runnable m3= () -> // runnable interface is a functional interface so we can use lambda expression to implement it
            {
                for(int i=1;i<=10000;i++)
                {
                    c.increment();
                   
                }
            };
    
        Runnable m4= () -> 
            {
                for(int i=1;i<=10000;i++)
                {
                    c.increment();
                   
                }
            
            };

        Thread t1=new Thread(m3);
        Thread t2=new Thread(m4);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count is: " + c.count); 
    }     
}

/*output


Count is: 20000


*/
    

