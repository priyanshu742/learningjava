
abstract class car 
{
    // ABSTRACT METHOD CAN ONLY BE DECLATED IN A ABSTRACT CLASS

    public abstract void drive(); // declaring a method
    public abstract void fly();  // declaring a method

    public void playmusic() // defining a method
    {
        System.out.println("playing music");
    }  
}

abstract class WagonR extends car // AN ABSTRACT CLASS MAY OR MAY NOT HAVE A ABSTRACT METHOD
{
    public void drive() // The class WagonR must implement the inherited abstract method car.drive() and car.fly()
    {
        System.out.println("Driving");
    }
}

class updatedWagonR extends WagonR // concrete class
{
    public void fly() // The class WagonR must implement the inherited abstract method car.fly()
    {
        System.out.println("flying");
    }
}

public class abstractKeyword 
{
    public static void main(String args[]) 
    {
        // car obj= new car(); cannot create object of an abstract class
        // car obj= new WagonR(); cannot create object of an abstract class

        car obj= new updatedWagonR(); 
        obj.playmusic();
        obj.drive();
        obj.fly();       
    }
}

/*output

playing music
Driving
flying

*/