import java.util.*;
class q43
{
    public static int prime(int a)
    {
        if(a==1) return 0;
        int i,c=0;
        for(i=2;i<=a;i++)
        {
            if(a%i==0) c++;
        }
        if(c==1) return 1;
        else return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int x=sc.nextInt();
        int check=prime(x);
        if(check==0) System.out.println("PRIME NUMBER");
        else System.out.println("COMPOSITE NUMBER");
    }
}