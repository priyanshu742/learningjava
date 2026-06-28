
import tools.student;


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

        System.out.println(); 
      
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

        System.out.println(); 

        // using do while loop
        // the loop is executed atleast once even if the condition is false


         int l=9;
        do    
        {
            System.out.println("new" + l);
            l++;
        }while(i<=4);

        System.out.println(); 

        // using do while loop again

        int m=1;
        do    
        {
            System.out.println("old" + m);
            m++;
        }while(m<=4);

        System.out.println(); 

        // using for loop

        for(int n=1;n<=4;n++)
        {
            System.out.println("key" + n);
        }

        System.out.println(); 

        for(int p=1;p<=4;p+=2)
        {
            System.out.println("key" + p);
        }

        System.out.println(); 

        for(int r=4;r>=1;r--)
        {
            System.out.println("key" + r);
        }

        System.out.println(); 

        int s=0;
        for(s=0;s<=3;s++)       //for(int s=0;s<4;s++)
        {
            System.out.println("bread" + s);
        }

        System.out.println(); 


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

        System.out.println(); 

        // using enhanced for loop or for-each loop

        int num1[]=new int[5];
        System.out.println(num1[2]);  // {0,0,0,0,0}
        num1[0]=3;
        num1[1]=6;
        num1[2]=9;
        num1[3]=12;
        System.out.println(num1[2]); // {3,6,9,12,0}

        System.out.println(); 

        for(int n: num1)
        {
            System.out.println(n); // printing array using enhanced for loop
        }

        System.out.println();

        student s1=new student();
        s1.rollno=22;
        s1.name="jonas";
        s1.marks=87;

        student s2=new student();
        s2.rollno=23;
        s2.name="martha";
        s2.marks=22;

        student s3=new student();
        s3.rollno=22;
        s3.name="mikkel";
        s3.marks=90;

        student stu[]=new student[3];
        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;

        System.out.println("name" + " : " + "roll no" + " : " + "marks");
        for(student stud: stu)
        {
            System.out.println(stud.name + " : " + stud.rollno + " : " + stud.marks); // printing array of objects using enhanced for loop
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

0
9

3
6
9
12
0

name : roll no : marks
jonas : 22 : 87
martha : 23 : 22
mikkel : 22 : 90

[Done] exited with code=0 in 0.255 seconds

*/

