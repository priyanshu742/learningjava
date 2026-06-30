

// ENUM CANNOT EXTEND ANY OTHER CLASS


enum Games
{
    GTA(7500),TWD(1100),NFS,MedalOfHonour(200);

    private int price;

    private Games() 
    {
        price=500;
        System.out.println("in default constructor"); 
    }

    private Games(int pri) 
    {
        price=pri;
        System.out.println("in parameterized constructor");
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int pri) 
    {
        price= pri;
    }
}

public class extendedEnum 
{
    public static void main(String[] args) 
    {
        Games gam= Games.TWD;
        System.out.println(gam + " : " + gam.getPrice());

        System.out.println();

        for (Games g : gam.values())
        {
            System.out.println(g + " : " + g.getPrice());
        }

        gam.setPrice(7888);
        System.out.println(gam + " : " + gam.getPrice());   
    }
}

/* output


in parameterized constructor
in parameterized constructor
in default constructor
in parameterized constructor
TWD : 1100

GTA : 7500
TWD : 1100
NFS : 500
MedalOfHonour : 200
TWD : 7888

[Done] exited with code=0 in 0.295 seconds


*/