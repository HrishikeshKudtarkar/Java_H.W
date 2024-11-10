import java.util.*;
class pg195_Prog7
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,i,s;
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter 2 numbers");
            a = sc.nextInt();
            b = sc.nextInt();
            s = a+b;
            if(s<0)
            break;
            else
            System.out.println("Sum is "+s);
        }
        System.out.println("Terminate");
    }
}
