
    // importing tools from packages


import tools.advcalc;
import tools.calc;
import java.lang.System; // for output printing

public class usingPackage1
{
        public static void main(String args [])
    {
        System.out.println("hey");

        calc cal= new calc();
        advcalc cal2= new advcalc();

        int r1=cal.add(9,8);
        System.out.println(r1);

        int r2=cal2.add(9,6);
        System.out.println(r2);
    }
}

/*ouput

hey
17
17

*/
