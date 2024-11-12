import java.util.*;
class Pg199_Prog10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        long a,i,b,s;
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter 2 numbers");
            a=sc.nextLong();
            b=sc.nextLong();
            s= a+b;
            if(s<0)
            continue;
            System.out.println("The sum is "+s);
        }
    }
}
