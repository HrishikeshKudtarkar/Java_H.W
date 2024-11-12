import java.util.*;
class pg211_Prog6
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int i,n,a=1;
        long s=0;
        System.out.println("Enter value of n");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=a*i;
            s=s+a;
        }
        System.out.println("Solution is "+s);
    }
}
