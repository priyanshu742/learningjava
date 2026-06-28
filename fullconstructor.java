

import tools.Human;  

public class fullconstructor
{
    public static void main(String args [] )
    {
        Human h1= new Human();
        System.out.println(h1.getname()); // default value of string
        System.out.println(h1.getage()); // default value of int

        h1.setage(30);
        h1.setname("priyanshu");
        System.out.println(h1.getname() + " : " + h1.getage());

        Human h2= new Human(18 ,"kate");
        System.out.println(h2.getname() + " : " + h2.getage());

        Human h3= new Human("sawyer");
        System.out.println(h3.getname() + " : " + h3.getage());

        Human h4= new Human(50);
        System.out.println(h4.getname() + " : " + h4.getage());
    } 
}

/* output

jack
12
priyanshu : 30
kate : 18
sawyer : 0
hugo : 50

*/




 

