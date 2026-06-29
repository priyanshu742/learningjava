class typeconversion
{
    public static void main(String al[])
    {
        byte b=10;
        int a=b; //automatic type conversion (widening);implicit type conversion;coversion
        int c=100;
        byte d=(byte)c; //explicit type conversion ;casting
        int e=258;
        byte f=(byte)e; //explicit type conversion;using modulo

        float g=3.14f;
        int h=(int)g; //explicit type conversion;casting;loss of data       
        byte i=10;
        byte j=20;
        int result=i*j; //automatic type conversion to int;type promotion

        System.out.println(a);
        System.out.println(d);
        System.out.println(f);
        System.out.println(h);
        System.out.println(result);
    }
}

/*ouput

10
100
2
3
200

*/