import java.util.*;
class pg193_Prog5
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextLong();
        long r;
        while(n>0) 
        {
            r=n%10;
            if(r%2==0)
            System.out.println(r);
            else
            System.out.println(r);
            n=n/10;
        }  
    }
}
