

// JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE
import tools.calc;
import tools.advcalc;
import tools.scicalc;

public class fullinheritance 
{
    public static void main(String args[])
    {
        calc ca=new calc();
        int r1= ca.add(3,4);
        int r2= ca.sub(10,4);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println();

        // single level inheritance

        advcalc ca2=new advcalc();
        int r3= ca2.add(3,4);
        int r4= ca2.sub(10,4);
        int r5= ca2.multi(7,9);
        int r6= ca2.div(15,4);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println();

        // multi level inheritance

        scicalc ca3=new scicalc();
        int r7= ca3.add(56,4);
        int r8= ca3.sub(17,4);
        int r9= ca3.multi(9,9);
        int r10= ca3.div(15,6);
        double r11= ca3.pow(12,2);
        double r12= ca3.root(64);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);
        System.out.println(r12);       
    }   
}

/*output

7
6

7
6
63
3

60
13
81
2
144.0
8.0

[Done] exited with code=0 in 0.226 seconds


*/