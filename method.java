class computer
{
    public void playmusic() //does not return anyvalue
    {
        System.out.println("Music playing");
    }

    public String cookmaggi(int cost) // returns value
    {
        if(cost>=40)
            return "maggi cooking";
        return "low cost";
    } 
}

public class method
{
    public static void main(String args[])
    {
        computer comp= new computer();
        comp.playmusic();
        String tell=comp.cookmaggi(30);
        System.out.println(tell);
    }     

}
