import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int k=0;
    int gre=a[0];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    print_ele(a,n);
  }
  public static void print_ele(int a[],int n)
  {
    int gre=a[0];
    int k=0;
    for(int i=0;i<n;i++)
    {
      if(gre<a[i])
      {
        gre=a[i];
      }
    }
    k=gre;
    for(int i=0;i<n;i++)
    {
      if(k==a[i])
        System.out.print(i);
    }
  }
}
