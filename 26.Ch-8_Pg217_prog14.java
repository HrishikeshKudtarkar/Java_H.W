import java.util.*;
class pg217_Prog14
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int n,se=0,so=0;
        System.out.println("Enter a number and 0 to terminate");
        System.out.println("");
        while (true)
        {
            System.out.println("Enter a number");
            System.out.println("Press 0 to terminate");
            n=sc.nextInt();
            if(n==0)
            break;
            if(n>0 && n%2==0)
            se=se+n;
            if(n<0 && n%2!=0)
            so=so+n;
        }
        System.out.println("Sum of positive even numbers is "+se);
        System.out.println("Sum of negative odd numbers is "+so);
        System.out.println();
        System.out.println("----------End----------");
    }
}
