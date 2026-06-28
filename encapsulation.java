import tools.Human;


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