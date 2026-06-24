 
 class student  // for array of objects
        {
            int rollno;
            String name;
            int marks;
        }

public class fullarray
{
    public static void main(String args[])
    {
        // single dimensional array

        int num[] = {3,7,8,2};
        System.out.println(num); // prints the address instead
        System.out.println(num[1]);
        System.out.println(num[1] + num[2]);

        num[1]=5;
        System.out.println(num[1]);

        System.out.println(); 

        int num1[]=new int[5];
        System.out.println(num1[2]);  // {0,0,0,0,0}
        num1[0]=3;
        num1[1]=6;
        num1[2]=9;
        num1[3]=12;
        System.out.println(num1[2]); // {3,6,9,12,0}

        for(int i=0;i<5;i++)
        {
            System.out.println(num1[i]);
        }

        System.out.println(); 


        // multi dimensional array or 2D array


        int nums[][]= new int[3][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
                {
                    nums[i][j]=(int)(Math.random()*10); // entering random values using random function which generates random double type values in range 0 to 0.99
                }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
                {
                   System.out.print(nums[i][j]+ "  ");
                }
            System.out.println();       
        } 

        System.out.println(); 
        
        // enhanced for loop

        for(int n[]: nums)
        {
            for(int m : n)
            {
                System.out.print(m + "  ");
            }
            System.out.println();          
        }

        System.out.println(); 

        // multi dimensional array or 3D array


        int nums2[][] []= new int[3][4][5];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
                {
                    for(int k= 0 ;k<5;k++)
                    {
                         nums2[i][j][k]=(int)(Math.random()*10); // entering random values using random function which generates random double type values in range 0 to 0.99
                    }                    
                }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
                {
                    for(int k= 0 ;k<5;k++)
                    {
                        System.out.print(nums2[i][j][k] + "  ");                    
                    }
                    System.out.println();                    
                }
        }

        System.out.println(); 

        // jagged array

        int arr[][]= new int[3][]; // jagged
        arr[0]=new int [3];
        arr[1]=new int [4];
        arr[2]=new int [2];

        for(int i=0; i<arr.length ;i++)
        {
            for(int j=0; j<arr[i].length ;j++)
                {
                    arr[i][j]=(int)(Math.random()*10); // entering random values using random function which generates random double type values in range 0 to 0.99
                }
        }

         for(int i=0; i<arr.length ;i++) // arr.length is used to determine the size of array
        {
            for(int j=0; j<arr[i].length ;j++)
                {
                    System.out.print(arr[i][j]+ "  ");
                }
            System.out.println();                     
        }

        // printing jagged array using enhanced for loop (no modifications needed); automatically grabs the rows

        for(int n[]: arr)
        {
            for(int m : n)
            {
                System.out.print(m + "  ");
            }
            System.out.println();          
        }

         System.out.println(); 

        // array of objects

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

        student s[]=new student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;

        System.out.println(s1); // prints address instead
        
        System.out.println("name" + " : " + "roll no" + " : " + "marks");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].name + " : " +s[i].rollno + " : " + s[i].marks);
        }
    }
    
}

/*output

[I@2b2fa4f7
7
15
5

0
9
3
6
9
12
0

1  2  6  3  
7  8  4  3  
9  4  1  9  

1  2  6  3  
7  8  4  3  
9  4  1  9  

1  4  1  6  7  
8  0  3  6  7  
4  7  8  0  3  
6  2  0  3  9  
7  9  7  7  1  
2  0  3  9  8  
5  6  8  0  9  
2  6  9  2  9  
1  2  6  1  7  
4  6  4  1  8  
0  7  8  4  1  
9  5  7  7  7  

8  3  1  
8  5  0  2  
5  4  
8  3  1  
8  5  0  2  
5  4  

student@7344699f
name : roll no : marks
jonas : 22 : 87
martha : 23 : 22
mikkel : 22 : 90

[Done] exited with code=0 in 0.237 seconds


 */

    

