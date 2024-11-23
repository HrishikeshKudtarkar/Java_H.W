import java.util.*;
class pg215_Prog10
{
    public static void main ()
    {
        Scanner sc= new Scanner(System.in);
        int a,m,n,min,max;
        System.out.println("Enter the first number");
        n=sc.nextInt();
        max=n; min=n;
        System.out.println("Enter the remaining 9 numbers one by one.");
        for(a=2;a<=10;a++)
        {
            m=sc.nextInt();
            if(m<min)
            min=m;
            if(m>max)
            max=m;
        }
        System.out.println("Largest number is "+max);
        System.out.println("Smallest number is "+min);
    }
}
