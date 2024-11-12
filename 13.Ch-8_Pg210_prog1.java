import java.util.*;
class pg210_Prog1
    {
    public static void main ()
    {
        Scanner sc= new Scanner(System.in);
        int i,s=0;
        System.out.println("Enter a number");
        long n=sc.nextLong();
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("Solution is "+s);
    }
}
