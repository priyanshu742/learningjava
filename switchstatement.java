public class switchstatement
{
    public static void main(String[] args)
    {

        //old switch statement 

        int n = 4;
        switch (n)
         {
            case 1:
                System.out.println("Monday"); // falling through property is valid here if break statement is not used
                break;
            case 2:
                System.out.println("Tuesday"); // falling through property is valid here if break statement is not used
                break;
            case 3:
                System.out.println("Wednesday"); // falling through property is valid here if break statement is not used   
                break;
            case 4:
                System.out.println("Thursday"); // falling through property is valid here if break statement is not used
                break;
            case 5:
                System.out.println("Friday"); // falling through property is valid here if break statement is not used
                break;
            case 6:
                System.out.println("Saturday");// falling through property is valid here if break statement is not used
                break;
            case 7: 
                System.out.println("Sunday");// falling through property is valid here if break statement is not used
                break;
            default:
                System.out.println("Enter a valid number");    
        }


        //new switch statement without break statement

        //use either all the new symbols or colon in a single switch statement

        // using the new symbol here

        String day ="Monday";

        switch(day)
        {
            case "Monday" , "Tuesday" -> System.out.println("I Hate it");

            case "Wednesday" -> System.out.println ("Average day");

            default -> System.out.println("no comments");
        } 


        // new switch statement without break statement

        // using the new symbol here

        String din="Tuesday";
        String result=" ";

        switch(din)
        {
            case "Monday" , "Tuesday" -> result="I Hate it";

            case "Wednesday" -> result= "Average day"; 

            default -> result="no comments";
        }

         System.out.println(result);


         // new switch statement as a expression without break statement

         // using the new symbol here

          String parv="Friday";
          String answer=" ";

          answer=switch(parv)
        {
            case "Monday" , "Tuesday" -> "I Hate it";

            case "Wednesday" -> "Average day"; 

            default -> "no comments";
        };
        System.out.println(answer);


         // new switch statement as a expression without break statement

         // using colon here but we have to use yield here

          String vaar="Saturday";
          String ans=" ";

          ans=switch(vaar)
        {
            case "Monday" , "Tuesday" : yield "I Hate it";

            case "Wednesday" :  yield "Average day"; 

            default :  yield "no comments";
        };
        System.out.println(ans);

    }
}