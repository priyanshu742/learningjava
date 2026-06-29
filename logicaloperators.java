public class logicaloperators
{
    public static void main(String[]args)
    {
        int a=10,b=20,c=30,d=40;
        boolean result=a<b;
        System.out.println(result);


        boolean result1=a<b && c<d;
        System.out.println(result1);


        boolean result2=a<b && c>d;
        System.out.println(result2);


        boolean result3=a<b || c>d;
        System.out.println(result3);


        boolean result4=a>b || c>d;
        System.out.println(result4);

        boolean result5=a<b || c<d;
        System.out.println(result5);

        boolean result6= a>b || c<d || a>1;
        System.out.println(result6);

        boolean result7= !(a>b || c<d); //not operator
        System.out.println(result7);

        boolean result8= a<b && c<d;
        System.out.println(!result8);
    }
}




/* short circuit happens in logical operators when the first condition is sufficient to determine the result, the second condition is not evaluated.

For example, in the expression a<b || c>d, if a<b is true, then the entire expression will be true regardless of the value of c>d, so c>d will not be evaluated.

Also in above code, in result3, since a<b is true, the second condition c>d is not evaluated, and the result is true.
In result5, since a<b is true, the second condition c<d is not evaluated, and the result is true.
In result6, since a>b is false, so the second condition c<d is evaluated, and the result is true, so the third condition a>1 is not evaluated.



  This can improve performance by avoiding unnecessary evaluations. */

  /*ouput
  
  true
true
false
true
false
true
true
false
false

*/