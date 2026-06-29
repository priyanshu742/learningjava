

// wrapper classes used to create object of primitive datatypes because most frameworks only support objects

// HERE USING WRAPPER CLASS INTEGER ( PROVIDES MULTIPLE ADDITIONAL METHODS )


public class wrapperClass 
{
    public static void main(String[] args) 
    {
        int num1=7;
        Integer num2=new Integer(8); // boxing     // deprecated method
        Integer num3=num1; // autoboxing


        int num4=num3; // autounboxing ; to get the value 
        int num5=num3.intValue(); // unboxing ; to get the value

    
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        String str="12";
        int num6=Integer.parseInt(str);
        System.out.println(num6*5);    
    }  
}

/* output

[Running] cd "/Users/priyanshusingh/javacourse/" && javac wrapperClass.java && java wrapperClass
Note: wrapperClass.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
7
8
7
7
7
60

[Done] exited with code=0 in 0.233 seconds

 */
