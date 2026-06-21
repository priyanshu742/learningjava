class arithmetic
{
    public static void main(String a[])
    {
        int x =10;
        int y=20;
        int result1=x+y; //addition
        int result2=x-y; //subtraction
        int result3=x*y; //multiplication
        int result4=x/y; //division
        int result5=x%y; //modulus gives remainder
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);    


        int c=16;
        c=c+4; //c=c+4;
        System.out.println(c);

        int d=56;
        d+=4; //d=d+4;
        System.out.println(d);
        d-=4; //d=d-4;
        System.out.println(d);
        d*=4; //d=d*4;
        System.out.println(d);
        d/=4; //d=d/4;
        System.out.println(d);


        int e=212;
        e++; //e=e+1;post-increment operator; incrementing
        System.out.println(e);

        int f=346;
        f--; //f=f-1;post-decrement operator; decrementing
        System.out.println(f);



        int g=76;
        ++g; //g=g+1;pre-increment operator; incrementing
        System.out.println(g);

        int h=98;
        --h; //h=h-1;pre-decrement operator; decrementing
        System.out.println(h);

        int i=92;
        int ans1=i++; //post-increment operator;incrementing;   ans=92;   i=93 ; fetching the value of i first and then incrementing it
        System.out.println(ans1);

        int j=46;
        int ans2=j--; //post-decrement operator;decrementing;   ans2=46;   j=45; fetching the value of j first and then decrementing it
        System.out.println(ans2);


        int k=34;
        int ans3=++k; //pre-increment operator;incrementing;   ans3=35;     k=35; incrementing the value of k first and then fetching it
        System.out.println(ans3);

        int l=78;
        int ans4=--l; //pre-decrement operator;decrementing;   ans4=77;   l=77; decrementing the value of l first and then fetching it
        System.out.println(ans4);

    }
}