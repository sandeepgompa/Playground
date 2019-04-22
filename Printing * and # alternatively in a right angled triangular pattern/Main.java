import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int num=0;
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=r;c++)
        {
          num=num+1;
          if(num%2!=0)
          System.out.print("*");
          else 
          System.out.print("#");
           
        }
        System.out.print("\n");
      }
    }
}