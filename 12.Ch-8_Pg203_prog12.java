import java.util.*;
class pg203_Prog12
{
    public static void main()
    {
        int i=0;
        do
        {
            i++;
            if(i%2!=0)
            continue;
            System.out.println(i);
        }
        while(i<=10);
    }
}
