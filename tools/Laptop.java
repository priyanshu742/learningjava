package tools;

public class Laptop implements Comp// present by default
{
    public String model;
    public int price; 

    /* generetaed by IDE

    @Override
    public String toString() 
    {
        return "Laptop [model=" + model + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

    */

     public String toString() // method overriding
    {
        return model +  " : " + price;
    }

    /* generetaed by IDE

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    */

    public boolean equals(Laptop rival) // method overriding
    {
        return this.model==rival.model && this.price == rival.price;
    }

    public void Code() 
    {
        System.out.println("code,compile,run");
    }
}
    

