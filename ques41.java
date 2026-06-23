import java.util.*;
class q41
{
    public static int SumOfTwo(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int x=sc.nextInt();
        System.out.print("Enter Second Number:");
        int y=sc.nextInt();
        int s=SumOfTwo(x,y);
        System.out.println("Sum="+s);
    }
}