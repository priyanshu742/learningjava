package tools;

public class computer 
{

    public void playmusic() //does not return anyvalue
    {
        System.out.println("Music playing");
    }

    public String cookmaggi(int cost) // returns value
    {
        if(cost>=40)
        {
            return "maggi cooking";
        }
        else
        {
            return "low cost";
        }
    }
}
