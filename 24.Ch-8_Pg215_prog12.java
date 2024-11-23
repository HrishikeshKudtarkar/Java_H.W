import java.util.*;
class pg215_Prog12
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = sc.nextLong();
        long r,s=0,q;
        while(n>0)
        {
            r= n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("Sum of the digits is  "+s);
    }
}
