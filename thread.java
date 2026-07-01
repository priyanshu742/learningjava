

class message1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(" hi " + i);
            try 
            {
                Thread.sleep(10);
            }
             catch (InterruptedException e) 
            {
                e.printStackTrace();
            } 
        }
    }
}

class message2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(" hello " + i);
            try 
            {
                Thread.sleep(10);
            }
             catch (InterruptedException e) 
            {
                e.printStackTrace();
            } 
        }
    }
}

public class thread 
{
    public static void main(String[] args) 
    {
        message1 m1= new message1();
        message2 m2= new message2();

        System.out.println(m1.getPriority());
        m2.setPriority(Thread.MAX_PRIORITY);

        m1.start();
        try 
            {
                Thread.sleep(10);
            }
             catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        m2.start();
    }  
}

/*output

5
 hi 1
 hello 1
 hi 2
 hello 2
 hi 3
 hello 3
 hi 4
 hello 4
 hi 5
 hello 5
 hi 6
 hi 7
 hello 6
 hi 8
 hello 7
 hello 8
 hi 9
 hello 9
 hi 10
 hi 11
 hello 10
 hi 12
 hello 11
 hello 12
 hi 13
 hello 13
 hi 14
 hello 14
 hi 15
 hi 16
 hello 15
 hello 16
 hi 17
 hello 17
 hi 18
 hello 18
 hi 19
 hello 19
 hi 20
 hi 21
 hello 20
 hi 22
 hello 21
 hi 23
 hello 22
 hi 24
 hello 23
 hi 25
 hello 24
 hi 26
 hello 25
 hello 26
 hi 27
 hello 27
 hi 28
 hello 28
 hi 29
 hello 29
 hi 30
 hello 30
 hi 31
 hello 31
 hi 32
 hi 33
 hello 32
 hi 34
 hello 33
 hello 34
 hi 35
 hi 36
 hello 35
 hi 37
 hello 36
 hello 37
 hi 38
 hello 38
 hi 39
 hello 39
 hi 40
 hello 40
 hi 41
 hello 41
 hi 42
 hello 42
 hi 43
 hello 43
 hi 44
 hello 44
 hi 45
 hello 45
 hi 46
 hello 46
 hi 47
 hello 47
 hi 48
 hello 48
 hi 49
 hello 49
 hi 50
 hello 50
 hi 51
 hello 51
 hi 52
 hi 53
 hello 52
 hello 53
 hi 54
 hello 54
 hi 55
 hello 55
 hi 56
 hi 57
 hello 56
 hi 58
 hello 57
 hi 59
 hello 58
 hi 60
 hello 59
 hi 61
 hello 60
 hello 61
 hi 62
 hello 62
 hi 63
 hello 63
 hi 64
 hello 64
 hi 65
 hello 65
 hi 66
 hello 66
 hi 67
 hello 67
 hi 68
 hi 69
 hello 68
 hello 69
 hi 70
 hello 70
 hi 71
 hello 71
 hi 72
 hi 73
 hello 72
 hi 74
 hello 73
 hi 75
 hello 74
 hi 76
 hello 75
 hello 76
 hi 77
 hello 77
 hi 78
 hello 78
 hi 79
 hello 79
 hi 80
 hello 80
 hi 81
 hello 81
 hi 82
 hello 82
 hi 83
 hello 83
 hi 84
 hi 85
 hello 84
 hi 86
 hello 85
 hi 87
 hello 86
 hi 88
 hello 87
 hi 89
 hello 88
 hi 90
 hello 89
 hi 91
 hello 90
 hi 92
 hello 91
 hi 93
 hello 92
 hi 94
 hello 93
 hi 95
 hello 94
 hi 96
 hello 95
 hi 97
 hello 96
 hi 98
 hello 97
 hi 99
 hello 98
 hi 100
 hello 99
 hello 100

[Done] exited with code=0 in 1.538 seconds

*/
