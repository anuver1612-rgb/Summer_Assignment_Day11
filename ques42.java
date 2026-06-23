import java.util.*;
class q42
{
    public static int maximum(int a,int b)
    {
        if(a>b) return a;
        else return b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int x=sc.nextInt();
        System.out.print("Enter Second Number:");
        int y=sc.nextInt();
        int max=maximum(x,y);
        System.out.println("Greater number is "+max);
    }
}