import java.util.*;
class pg190
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 number");
        int i = 1,n,s=0;
        while(i<=10)
        {
            n=sc.nextInt();
            if(n<0)
            s=s+n;
            else
            i++;
        }
        System.out.println("Sum is "+s);
    }
}
