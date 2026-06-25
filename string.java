// string is a class 
// string is immutable

public class string
 {
    public static void main(String args[])
    {
        String name=new String();
        System.out.println(name); // default value of string is null but here we are creating an empty string

        String name1=new String("priyanshu"); // String name1="priyanshu"
        System.out.println(name1);
        System.out.println("hello " + name1); // concatenation 
        System.out.println(name1.concat(" singh"));
        System.out.println(name1.charAt(3));
        System.out.println(name1.hashCode());
        name1 = "singh" + name1;  // appending ; creates a new string internally in heap and starts pointing there (proves immutability)
        System.out.println("hello " + name1); 



        String name2="PRIYANSHU SINGH";
        System.out.println(name2);
        String name3="PRIYANSHU SINGH";
        System.out.println(name2==name3); // pointing to the same address


        System.out.println(); 

        // stringbuffer and stringbuilder are used to create mutable string

        // stringbuffer is thread safe while stringbuilder is not

        StringBuffer sb= new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb);

        StringBuffer sb1= new StringBuffer("jonas");
        System.out.println(sb1.capacity());
        System.out.println(sb1);
        System.out.println(sb1.length());
        sb1.append(" martha"); // appending ; appends in the same string (proves mutability)
        System.out.println(sb1);
        sb1.deleteCharAt(3); //(proves mutability)
        System.out.println(sb1);
        sb1.insert(5," loves "); // (proves mutability)
        System.out.println(sb1);
        sb1.ensureCapacity( 100);
        System.out.println(sb1);

        String str=sb1.toString();
        System.out.println(str);
    } 

}

/* output

priyanshu
hello priyanshu
priyanshu singh
y
-1498815999
hello singhpriyanshu
PRIYANSHU SINGH
true

16

21
jonas
5
jonas martha
jons martha
jons  loves martha
jons  loves martha
jons  loves martha

[Done] exited with code=0 in 0.245 seconds

*/


