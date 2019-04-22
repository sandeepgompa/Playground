import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,sum=0,temp,k;
      k=n;
      while(n>0)
      {
        temp=n%10;
        sum=temp*temp*temp+sum;
        n=n/10;
      }
      if(sum==k)
      System.out.println("Armstrong Number");
      else
      System.out.println("Not a Armstrong Number");
        
  
      
     
       
	}
}