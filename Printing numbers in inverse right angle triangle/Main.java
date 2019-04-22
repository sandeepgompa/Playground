import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n;
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=n-r+1;c++)
        {
          
          System.out.print(num-c+1);
          
          
        }num--;
        System.out.print("\n");}
	}
}