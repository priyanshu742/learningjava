
// class --- class --> extends
// class --- interface --> implements
// interface -- interface --> extends



// METHODS ARE ALWAYS PUBLIC AND ABSTRACT IN INTERFACE

interface First
{
    int age=44; // VARIABLES ARE ALWAYS FINAL AND STATIC
    String city="Mumbai";

    void show(); // METHODS ARE ALWAYS PUBLIC AND ABSTRACT
    void config();
}

interface ten
{
    void run();
}

interface twenty extends ten // for example
{

}

class Second implements First,ten // implements for interface
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

    public void run() 
    {
        System.out.println("running ");
    }
}

public class halfInterface 
{
    public static void main(String[] args) 
    {
        First obj;
        obj= new Second();
        obj.config();
        obj.show();
        // obj.run(); can't use this because First don't know about run

        ten obj1=new Second();
        obj1.run();
        // obj1.config(); obj.run(); can't use this because ten don't know about config
        // obj1.show(); can't use this because ten don't know about show

    
        System.out.println(First.city);   
    } 
}


/* output


in config
in show
running
Mumbai


*/
