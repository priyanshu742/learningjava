class adder
{
    public int add(int n1,int n2,int n3) // for three parameters
    {
         return n1+n2+n3;
    }

    public int add(int n1,int n2)  // for two parameters
    {
         return n1+n2;
    }

    public double add(double n1,int n2) //for diff type ; double + int = double 
    {
         return n1+n2;
    }  
}

public class methodoverloading
{
    public static void main(String args[])
    {
        adder obj= new adder();
        int result1=obj.add(3,4,5);
        System.out.println(result1);

        int result2=obj.add(3,4);
        System.out.println(result2);

        double result3=obj.add(3.5,4);
        System.out.println(result3);
        
    }
}


/* output

12
7
7.5

 */
    

