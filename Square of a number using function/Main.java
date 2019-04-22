import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
   int sq=n*n;
    return sq;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
       int sq=in.nextInt();
      int res=square(sq);
      System.out.println(res);
	} 
}