import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in= new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder sb=new StringBuilder(s);
      int l=sb.length();
      int front =0;
      int end=l-1;
      int c=1;
        
      while(front < end)
      {
        if(sb.charAt(front)==sb.charAt(end))
        {
          c=0;
        }
        else
        {
          c=1;
          break;
        }
        front++;
        end--;
      }
      if(c==1)
        System.out.print("No");
      else
        System.out.print("Yes");
          
      
    } 
}