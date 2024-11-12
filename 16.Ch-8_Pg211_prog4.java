import java.util.*;
class pg211_Prog4
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        double s=0;
        System.out.println("Enter value of n");
        n = sc.nextInt();
        for(i=0;i<=10;i++)
        {
            if(i%2!=0)
            s=s-Math.pow(n,i);
            else
            s=s+Math.pow(n,i);
        }
        System.out.println("Solution is "+s);
    }
}
