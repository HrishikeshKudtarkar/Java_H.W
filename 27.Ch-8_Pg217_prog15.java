import java.util.*;
class pg217_Prog15
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        int i,n,s=0;
        for(i=1;i<=20;i++)
        {
            System.out.print(i+".");
            System.out.println("Enter a number");
            n=sc.nextInt();
            if(n%3==0 && n%5==0)
            {
                s=s+n;
            }
            System.out.println("Sum of numbers divisible by 3 and 5 is "+s);
        }
    }
}
