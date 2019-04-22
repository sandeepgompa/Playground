import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int cout,sum=0;
      for(cout=1;cout<=n;cout++)
      {
       sum=cout+sum;
         
      } System.out.println(sum);
	}
}