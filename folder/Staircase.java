import java.util.Scanner;
class Staircase{

public static void main(String args[])

{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number of stairs");
int n=sc.nextInt();
System.out.println("total no of ways to reach the top of "+n+" stair is"+ staircase(n));
}

static void staircase(int n)
{
if(n<0)return 0;
if(n<=2)return n;
if(n==3)return 4;
return (staircase(n-1)+staircase(n-2)+staircase(n-3));
}
}