import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here\
    Scanner in=new Scanner(System.in);
    String s1=in.nextLine();
    String s2=in.nextLine();
    int l1=s1.length();
    int l2=s2.length();
    int count=0;
    for(int i=0;i<(l1-l2+1);i++)
    {
      
      for(int j=0;j<l2;j++)
      {
        if(s1.charAt(i+j)==s2.charAt(j))
        {
          count++;
        }
      }
    }
    System.out.print(count/l2);
  } 
}
