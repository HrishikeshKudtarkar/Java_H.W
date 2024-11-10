import java.util.*;
class pg193_Prog6
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextLong();
        long r;
        do
        {
            r=n%10;
            if(r%2==0)
            System.out.println("It is a even number"+r);
            else
            System.out.println("It is odd number"+r);
            n=n/10;
        }
        while(n>0);   
    }
}
