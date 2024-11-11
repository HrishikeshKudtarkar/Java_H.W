import java.util.*;
class pg198_Prog9
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        long n;
        while(true)
        {
            System.out.println("Enter any number");
            n = sc.nextLong();
            if(n==0)
            {
            System.out.println("Terminate");
            break;
            }
            else
            {
                if(n<0)
                System.out.println("It is a negative number");
                else
                System.out.println("It is a positive number");
            }
        }
    }
}
