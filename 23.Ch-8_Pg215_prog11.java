class pg215_Prog11
{
    public static void main ()
    {
        int a=0,b=1,c=0,n=3;
        System.out.println("Series is :-");
        System.out.println(a);
        System.out.println(b);
        do
            {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n++;
            }
        while(n<11);
    }
}
