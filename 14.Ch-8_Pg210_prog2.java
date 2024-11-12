import java.util.*;
class pg210_Prog2
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int i,s=0;
        System.out.println("Enter ten numbers one by one.");
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter a number");
            long n=sc.nextLong();
            s=s+i;
        }
        System.out.println("Solution is "+s);
    }
}
