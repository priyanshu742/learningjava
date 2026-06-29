

class Alpha
{
    int age;

    public void show()
    {
        System.out.println("In alpha");
    }    
        
    class Beta // inner class
    {
    
        public void sing()
        {
            System.out.println("Beta sings");
        }
    } 
    
    static class Gamma // inner class
    {
        public void cry()
        {
            System.out.println("Gamma cries");
        }
    }   
}

public class innerclass 
{
    public static void main(String[] args) 
    {
        Alpha obj=new Alpha();
        obj.show();

        Alpha.Beta obj1= obj.new Beta(); // need of object for creating a non static inner-class
        obj1.sing();

        Alpha.Gamma obj2= new Alpha.Gamma(); // no need of object for creating a  static inner-class
        obj2.cry();
    }   
}

/*ouput

In alpha
Beta sings
Gamma cries

*/
