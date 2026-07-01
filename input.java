import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class input 
{
    public static void main(String[] args) throws Exception
    {
        // OLD WAY TO TAKE INPUT FROM USER
        System.out.println("Enter a number");
        InputStreamReader in = new  InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);

        // NEW WAY TO TAKE INPUT FROM USER
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println(num1);

        sc.close();
        br.close();
    }  
}

/* output 


Enter a number
99
99
Enter a number
78
78


*/
