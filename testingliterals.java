public class testingliterals
{
    public static void main(String a[])
    {
        int num1=0b101; //binary literal
        int num2=0x1A; //hexadecimal literal
        int b=100_00_00_000; //underscore in numeric literal for better readability
        double d1=89; //automatically converted as decimal  
        double d2=12e3; //exponential literal
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(b);
        System.out.println(d1);
        System.out.println(d2);
        char c='A';
        c++;
        System.out.println(c);
    }  
}

/*output

5
26
1000000000
89.0
12000.0
B

*/