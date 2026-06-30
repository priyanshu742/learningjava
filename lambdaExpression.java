

// LAMBDA EXPRESSION ONLY WORKS WITH FUNCTIONAL INTERFACE
// LAMBDA EXPRESSION DOES NOT GENERATE ANY ADDITIONAL FILE FOR ANONYMOUS INNER CLASS ; LESS FILE TO MANAGE
// INSTEAD THE MAIN FILE (HERE functionalInterface ) WILL BECOME MORE HEAVY


@FunctionalInterface 
interface hell
{
    void where(); // method with no parameter
}

@FunctionalInterface 
interface lucknow
{
    void what(int i); // method with one parameter
}

@FunctionalInterface 
interface work
{
    int add(int i,int j); // method with two parameter and having a return type
}

public class lambdaExpression 
{
    public static void main(String[] args) 
    {
       /*  hell obj= new hell() // anonymous inner class
        {
            public void where()
            {
                System.out.println("NOT IN HEAVEN");
            }  
        }; 
        obj.where(); 
        */

        hell obj= () ->  System.out.println("NOT IN HEAVEN"); // lambda expression for single statement ( FOR MULTIPLE STATEMENTS USE CURLY BRACES )
        obj.where(); 

        lucknow luck= (int i) -> System.out.println("eating : " + i ); // lambda expression with parameters
        // lucknow luck=i -> System.out.println(" eating : " + i ); can also write like this (NO NEED OF VARIABLE TYPE AND BRACKETS)
        
        luck.what(5);

        work w = (i,j) -> i+j; // no need of return also
        int result=w.add(9,7);
        System.out.println(result);    
    } 
}

/*output


NOT IN HEAVEN
eating : 5
16


*/
