import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    perfectbatch(a,n);
  }
   public static void perfectbatch(int a[],int n)
   {int k=0,sum1=0;
     int sum=a[0]+a[1]+a[2];
     for(int i=3;i<n;i=i+3)
     {
       sum1=a[i+1]+a[i]+a[i+2];
     }
     if(sum1!=sum)
       k=1;
    if(k==0)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
   }
}