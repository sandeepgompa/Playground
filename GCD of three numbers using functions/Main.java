import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int s=0,k=0;
      s=greatestnum(n1,n2);
      k=greatestnum(s,n3);
      System.out.println(k);
    }
  public static int greatestnum(int n1,int n2)
  {int gre=0,gcd=0;
    if(n1>n2)
      gre=n2;
    else
       gre=n1;
     while(gre>=1)
     {
       if((n1%gre==0)&&(n2%gre==0))
       {
         gcd=gre;
         break;
       }
       else
         gre--;
  }
   return gcd;
  }
}
     

