import java.util.*;
class pg210_Prog3
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        double s=0;
        System.out.println("Enter value of n");
        long n = sc.nextLong();
        for(i=1;i<=n;i++)
        {
            s=s+1.0/Math.pow(2,i);
        }
        System.out.println("Solution is "+s);
    }
}
