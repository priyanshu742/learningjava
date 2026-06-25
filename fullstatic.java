
class mobile
{ 
    // instance variables
    String brand; 
    int price;

    // static variable
    static String type;
    static int objectcount =0;

    // constructor 
    // used for initialising default values to instance variables
    // Always called as soon as any object is created

    public mobile()
    {
        objectcount++; 
        brand=" "; // Default value
        price=1000; // Default value
        
        System.out.println(objectcount + " object created" );
    }

    // static block
    // used to initialise static variable and is only called once

    static
    {
        type="phone";
        System.out.println("I AM ONLY CALLED ONCE AND ALWAYS BEFORE CONSTRUCTOR BECAUSE AS SOON AS CLASS IS CREATED.... THE CLASS IS LOADED AND I M CALLED AT THAT TIME ONCE" );
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }

    // static method

    public static void show1(mobile k)
    {
        System.out.println(k.brand + " : " + k.price + " : " + type);
    }
}

// extra class

class force
{
    static
    {
        System.out.println("I AM FORCEFULLY CALLED BY THAT METHOD EVEN THOUGH MY CLASS IS NOT USED IN CREATING ANY OBJECT" );

    }
}

public class fullstatic
{
    public static void main(String args[]) throws ClassNotFoundException // Exception handling
    {
        
        mobile m1= new mobile();
        m1.brand= "apple";
        m1.price=5000;
        mobile.type="smartphone";

        mobile m2= new mobile();
        m2.brand= "banana";
        m2.price=6000;

        m1.show();
        m2.show();

        mobile.show1(m1);

        Class.forName("force"); // used to forcefully load the class even if the object is not created from that  class
    }   
}
