import java.util.*;
class pg188_prog3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n= 0;
        int i= 0;
        int s= 0;
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter numbers one at a time");
            n = sc.nextInt();
            if(n%2!=0)
            {
                s=s+n;
            }
        }
        System.out.println("Sum is "+s);
    }
}
