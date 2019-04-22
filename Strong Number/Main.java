import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fact,i,rem,sum=0;
      int x=n;
      while(n>0)
      {
       rem=n%10;
        fact=1;
      for(i=1;i<=rem;i++)
      {
        fact=fact*i;
        
      }sum=sum+fact;
        n=n/10;
      }
      if(sum==x)
      System.out.println("Yes");
      else
      System.out.println("No");
      }
	}
	