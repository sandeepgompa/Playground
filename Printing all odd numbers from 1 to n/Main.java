import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int cout;
      for(cout=1;cout<=n;cout++)
      {
        if(cout%2==1)
         System.out.println(cout);
      }
	}
}