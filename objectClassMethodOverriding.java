
import tools.Laptop;

public class objectClassMethodOverriding
{
    public static void main(String args[])
    {
        Laptop obj= new Laptop();
        obj.model="Macbook";
        obj.price=1000;


        System.out.println(obj);
        // System.out.println(obj.*toString()*); present by default
       

        Laptop obj1= new Laptop();
        obj1.model="Macbook";
        obj1.price=1000;

        boolean result= obj.equals(obj1);
        System.out.println(result);
    }   
}

/*output

[Running] cd "/Users/priyanshusingh/javacourse/" && javac objectClassMethodOverriding.java && java objectClassMethodOverriding
Macbook : 1000
true

[Done] exited with code=0 in 0.229 seconds

*/
