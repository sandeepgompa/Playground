import java.util.Scanner;
class Main{
  public static int sumofnum(int n)
  {
    int sum=0;
    while(n>0)
    {
      sum=sum+n;
      n=n-1;
      }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int res=sumofnum(n);
      System.out.println(res);
	}
}