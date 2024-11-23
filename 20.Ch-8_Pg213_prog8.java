import java.util.*;
class pg213_Prog8
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter your number");
        b = sc.nextInt();
        for(a=1;a<b;a++)
        {
            if(b%a==0)
            System.out.println(a+"is a factor of "+b);
        }
    }
}
