import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int gre=n1;
      if(gre<n2)
        gre=n2;
      if(gre<n3)
        gre=n3;
      System.out.print(gre);
        
        
    }
}