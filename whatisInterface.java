
// METHODS ARE ALWAYS PUBLIC AND ABSTRACT IN INTERFACE

interface First
{
    int age=44; // VARIABLES ARE ALWAYS FINAL AND STATIC
    String city="Mumbai";

    void show(); // METHODS ARE ALWAYS PUBLIC AND ABSTRACT
    void config();
}

class Second implements First // implements for interface
{
    // necessary to create both abstract methods here
    public void show() 
    {
      System.out.println("in show");
    }

    public void config() 
    {
        System.out.println("in config");
    }
}

public class whatisInterface 
{
    public static void main(String[] args) 
    {
        First obj;
        obj= new Second();
        obj.config();
        obj.show();

        System.out.println(First.city);   
    } 
}
/* output


in config
in show
Mumbai


*/
