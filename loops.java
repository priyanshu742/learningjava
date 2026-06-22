public class loops
{
    public static void main(String args[])
    {
        // using while loop
  

        int i=1;
        while(i<=4)
        {
            System.out.println("Hi" + i);
            i++;
        }
        System.out.println("bye" + i);


      
       //using nested while loop

        int j=1;
        while(j<=4)
        {
            System.out.println("Hi" + j);
                int k=1;
                while (k<=3) 
                {
                    System.out.println("Hello" + k);
                    k++;
                }
            j++;
        }


        // using do while loop
        // the loop is executed atleast once even if the condition is false


         int l=9;
        do    
        {
            System.out.println("new" + l);
            l++;
        }while(i<=4);


        // using do while loop again



        int m=1;
        do    
        {
            System.out.println("old" + m);
            m++;
        }while(m<=4);


        // using for loop

        for(int n=1;n<=4;n++)
        {
            System.out.println("key" + n);
        }

        for(int p=1;p<=4;p+=2)
        {
            System.out.println("key" + p);
        }

        for(int r=4;r>=1;r--)
        {
            System.out.println("key" + r);
        }

        int s=0;
        for(s=0;s<=3;s++)       //for(int s=0;s<4;s++)
        {
            System.out.println("bread" + s);
        }


        //using nested for loop

        int t=0;
        for(t=1;t<=7;t++)       
        {
            System.out.println("DAY"  + t);
            for (int u=9;u<=17;u++)
            {
                System.out.println("    "+ u + "-" + (u+1));     
            }
        } 


    }

}

/* output

Hi1
Hi2
Hi3
Hi4
bye5
Hi1
Hello1
Hello2
Hello3
Hi2
Hello1
Hello2
Hello3
Hi3
Hello1
Hello2
Hello3
Hi4
Hello1
Hello2
Hello3
new9
old1
old2
old3
old4
key1
key2
key3
key4
key1
key3
key4
key3
key2
key1
bread0
bread1
bread2
bread3
DAY1
    9-10
    10-11
    11-12
    12-13
    13-14
    14-15
    15-16
    16-17
    17-18
DAY2
    9-10
    10-11
    11-12
    12-13
    13-14
    14-15
    15-16
    16-17
    17-18
DAY3
    9-10
    10-11
    11-12
    12-13
    13-14
    14-15
    15-16
    16-17
    17-18
DAY4
    9-10
    10-11
    11-12
    12-13
    13-14
    14-15
    15-16
    16-17
    17-18
DAY5
    9-10
    10-11
    11-12
    12-13
    13-14
    14-15
    15-16
    16-17
    17-18
DAY6
    9-10
    10-11
    11-12
    12-13
    13-14
    14-15
    15-16
    16-17
    17-18
DAY7
    9-10
    10-11
    11-12
    12-13
    13-14
    14-15
    15-16
    16-17
    17-18

    */
