class Human
{
    private int age;
    private String name;
    
    public void setage(int a) // setter
    {
        age=a;
    }

    public void setname(String n) // setter
    {
        name=n;
    }

    public int getage() // getter
    {
        return age;
    }

    public String getname() // getter
    {
        return name;
    }

    // using  "this" keyword in setters
    
    public int getAge() // getter
    {
        return age;
    }

    public String getName() // getter
    {
        return name;
    }
    
    //since we are using same variable name (age here) in setting the values.. the interpreter gets confused which age we are referring to (the instance age or local age)

    // this keyword signifies that the variable after "this" points to the current object (the object which is calling the method)

    public void setAge(int age) // setter
    {
        this.age = age;
    }
    
    //since we are using same variable name (name here) in setting the values.. the interpreter gets confused which age we are referring to (the instance age or local age)

    // this keyword signifies that the variable after "this" points to the current object (the object which is calling the method)

    public void setName(String name) // setter
    {
        this.name = name;
    } 
}

public class encapsulation 
{
    public static void main(String args [] )
    {
        Human h1= new Human();
        h1.setage(30);
        h1.setname("priyanshu");

        System.out.println(h1.getage());
        System.out.println(h1.getname());
        System.out.println(h1.getname() + " : " + h1.getage());

        Human h2= new Human();
        h2.setAge(50);
        h2.setName("debby");

        System.out.println(h2.getAge());
        System.out.println(h2.getName());
        System.out.println(h2.getName() + " : " + h2.getAge());
    }   
}


/* output 

30
priyanshu
priyanshu : 30
50
debby
debby : 50

*/