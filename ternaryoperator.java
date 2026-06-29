public class ternaryoperator
{
    public static void main(String[]args)
    {
        int n=9;
        int result=0;

        /*
        
        
            if(n%2==0)
            result=4; if number is even then result will be 4
        else
            result=5; if number is odd then result will be 5

            System.out.println(result);


        */

        // using ternary operator to write above code in single line 

        result= n%2==0 ?  4:  5;    //  condition? value if true : value if false 
        System.out.println(result);
    }
}

/*output

5

*/