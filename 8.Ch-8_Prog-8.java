import java.util.*;
class pg196_Prog8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double n,s;
        while(true)
        {
            System.out.println("Enter a positive number to cheak if it is a perfect Square");
            n= sc.nextDouble();
            if(n<=0)
            break;
            else
            {
                s=Math.sqrt(n);
                if((s*s)==n)
                System.out.println("It is a perfect Square");
                else
                System.out.println("It is not a perfect square");
            }
        }
    }
}
