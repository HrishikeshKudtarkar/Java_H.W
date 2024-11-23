import java.util.*;
class pg216_Prog13
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = sc.nextLong();
        long p,d,r=0;
        p=n;
        do
        {
            d= n%10;
            r= r*10+d;
            n= n/10;
        }
        while(n>0);
        if(r==p)
        System.out.println("It is a palindrome");
        else
        System.out.println("It is not a palindrome");
    }
}
