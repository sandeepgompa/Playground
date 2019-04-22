import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,rem;
      for(i=1;i<=n;i++)
      {
        rem=n%i;
        if(rem==0)
        System.out.println(i);
      }
	}
}